package io.armory.plugin.example.spring

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.netflix.spinnaker.config.DefaultServiceEndpoint
import com.netflix.spinnaker.config.okhttp3.DefaultOkHttpClientBuilderProvider
import com.netflix.spinnaker.config.okhttp3.OkHttpClientProvider
import com.netflix.spinnaker.okhttp.OkHttpClientConfigurationProperties
import io.armory.cloud.iam.client.AccessTokenSupplier
import io.armory.commons.cloud.retrofit.ArmoryCloudRequestInterceptor
import io.armory.commons.cloud.retrofit.RetrofitCloudClientFactory
import okhttp3.OkHttpClient
import retrofit.RestAdapter

open class CloudServiceFactory (
    override val iamConfig: IamConfig,
    override val apiConfig: ApiConfig
) : ICloudServiceFactory {

    override val cloudBaseUrl: String = apiConfig.baseUrl

    fun getHttpClient(): OkHttpClient {
        return OkHttpClient()
    }

    fun getAccessTokenSupplier(): AccessTokenSupplier? {
        return AccessTokenSupplier.builder()
            .clientId(iamConfig.clientId)
            .clientSecret(iamConfig.clientSecret)
            .tokenIssuerUrl(iamConfig.tokenIssuerUrl)
            .audience(cloudBaseUrl)
            .connectionTimeoutInSeconds(10)  // todo
            .requestTimeoutInSeconds(30)
            .build()
    }

    override fun getClient(): CloudService {
        val endpoint = DefaultServiceEndpoint("cloudService", cloudBaseUrl)
        val objectMapper = jacksonObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
            .configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false)

        val okHttpClientConfigurationProperties = OkHttpClientConfigurationProperties()
        val okHttpClientBuilderProvider = DefaultOkHttpClientBuilderProvider(getHttpClient(), okHttpClientConfigurationProperties)
        val okHttpClientProvider = OkHttpClientProvider(listOf(okHttpClientBuilderProvider))

        val interceptor = ArmoryCloudRequestInterceptor(getAccessTokenSupplier(), okHttpClientConfigurationProperties)
        val retrofitClientFactory = RetrofitCloudClientFactory(RestAdapter.LogLevel.BASIC, okHttpClientProvider, interceptor)
        val client = retrofitClientFactory.create(CloudService::class.java, endpoint, objectMapper)

        return client
    }

}