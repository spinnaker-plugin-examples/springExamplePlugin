package io.armory.plugin.example.spring

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("armory")
data class ArmoryConfig (
    var registrationId: String? = "",
    var installationSource: String? = ""
)

@ConfigurationProperties("armory.cloud.iam")
data class IamConfig(
    var tokenIssuerUrl: String = "https://auth.cloud.armory.io/oauth/token",
    var clientId: String? = "",
    var clientSecret: String? = ""
)

@ConfigurationProperties("armory.cloud.api")
data class ApiConfig(
    var baseUrl: String = "https://api.cloud.armory.io"
)
