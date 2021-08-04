package io.armory.plugin.example.spring

import com.netflix.spinnaker.config.DefaultServiceEndpoint
import com.netflix.spinnaker.retrofit.Slf4jRetrofitLogger
import com.squareup.okhttp.OkHttpClient
import retrofit.RestAdapter
import retrofit.client.OkClient

class CloudServiceFactoryDummy(
    override val iamConfig: IamConfig,
    override val apiConfig: ApiConfig
    ) : ICloudServiceFactory {

    override val cloudBaseUrl: String = apiConfig.baseUrl

    fun getHttpClient(): com.squareup.okhttp.OkHttpClient {
        return OkHttpClient()
    }

    override fun getClient(): CloudService {
        val endpoint = DefaultServiceEndpoint("cloudService", cloudBaseUrl)

        return RestAdapter.Builder()
            .setEndpoint(endpoint.toString())
            .setClient(OkClient(getHttpClient()))
            .setLogLevel(RestAdapter.LogLevel.BASIC)
            .setLog(com.netflix.spinnaker.retrofit.Slf4jRetrofitLogger(CloudService::class.java))
            .build()
            .create<CloudService>(CloudService::class.java)
    }
}