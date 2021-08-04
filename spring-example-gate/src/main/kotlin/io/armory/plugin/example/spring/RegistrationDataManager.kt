package io.armory.plugin.example.spring

class RegistrationDataManager (
    val config: ArmoryConfig,
    val cloudServiceFactory: CloudServiceFactory
) {
    fun getFeatureSpecific(): VerificationResponse {
        var cloudService = cloudServiceFactory.getClient()
        return cloudService.verifyRegistration(config.registrationId!!, VerificationRequest())
    }
}