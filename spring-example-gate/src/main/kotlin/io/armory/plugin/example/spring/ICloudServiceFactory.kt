package io.armory.plugin.example.spring

interface ICloudServiceFactory {
    val iamConfig: IamConfig
    val apiConfig: ApiConfig
    val cloudBaseUrl: String
    fun getClient(): CloudService
}