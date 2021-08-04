package io.armory.plugin.example.spring

import org.slf4j.LoggerFactory
import retrofit.RetrofitError

class RegistrationVerificationMessenger (
    val config: ArmoryConfig,
    val iamConfig: IamConfig,
    val cloudServiceFactory: CloudServiceFactory
): Messenger {

    private val logger = LoggerFactory.getLogger(RegistrationVerificationMessenger::class.java)

    override fun getName(): String {
        return "RegistrationVerificationMessenger"
    }

    val URL_RELEASE_NOTES = "https://docs.armory.io/docs/release-notes/rn-armory-spinnaker/"
    val URL_MANUAL_INSTANCE_ID_DOCS = "https://go.armory.io/UIdocs-deploy-reg-manual-id"
    val URL_REGISTRATION_CONFIG_DOCS = "https://go.armory.io/UIdocs-deploy-reg"


    val REDEPLOY_MESSAGE = "Operator failed to generate an instance ID. Please either redeploy using the " +
            "<a href='${URL_RELEASE_NOTES}' target='_blank' rel='noopener noreferrer'>recommended version of Armory Operator</a>" +
            " (1.4.0 or above) to try again or " +
            "<a href='${URL_MANUAL_INSTANCE_ID_DOCS}' target='_blank' rel='noopener noreferrer'>manually configure an instance ID</a>."

    val REGISTRATION_REQUIRED_MESSAGE = "You configured a feature that requires registration. Registering shares your unique instance " +
            "ID with Armory. Register here: <a href='https://console.cloud.armory.io/instances/register?instanceID=${config.registrationId}' " +
            "target='_blank' rel='noopener noreferrer'>https://console.cloud.armory.io/instances/register?instanceID=${config.registrationId}</a>"

    val MISSING_CLIENT_ID = "Missing clientId, please double check your configuration " +
            "<a href='${URL_REGISTRATION_CONFIG_DOCS}' target='_blank' rel='noopener noreferrer'>here</a>."
    val MISSING_CLIENT_SECRET = "Missing clientSecret, please double check your configuration " +
            "<a href='${URL_REGISTRATION_CONFIG_DOCS}' target='_blank' rel='noopener noreferrer'>here</a>."

    val INVALID_REGISTRATION = "Something went wrong with registration verification. Double check your configuration and " +
            "contact Armory if you think this is in error."
    // todo: ^ what if someone misplaces their client ID and secret?
    //  if they try to re-register, they'll get an error bc their org is already registered

    override fun fetchMessage(): BannerMessage {
        val validationErrors = validateConfig()
        if (validationErrors.isNotEmpty()) {
            return BannerMessage(validationErrors.joinToString("\n"), "warning")
        }
        if (!isRegistered()) {
            // the most common "not-registered-yet" (reg ID in yaml but no client ID/secret) flow is caught by the
            // validation method so this would be hit if the client ID and/or secret are invalid
            return BannerMessage(INVALID_REGISTRATION, "warning")
        }
        return BannerMessage()
    }

    // TODO validation errors class
    private fun validateConfig(): List<String> {
        var errors = mutableListOf<String>()

        // edge case where operator failed to set registration ID
        if (config.registrationId.isNullOrEmpty()) {
            errors.add(REDEPLOY_MESSAGE)
            return errors
        }

        // registration ID is set but user hasn't added client ID and secret to their config
        if (iamConfig == null || iamConfig == IamConfig()) {
            errors.add(REGISTRATION_REQUIRED_MESSAGE)
            return errors
        }

        // user has set set one or other
        if (iamConfig.clientId.isNullOrEmpty()) {
            errors.add(MISSING_CLIENT_ID)
        }
        if (iamConfig.clientSecret.isNullOrEmpty()) {
            errors.add(MISSING_CLIENT_SECRET)
        }

        return errors
    }


    private fun isRegistered(): Boolean {
        val cloudService = cloudServiceFactory.getClient()

        try {
            val request = VerificationRequest(installationSource = config.installationSource)
            val response = cloudService.verifyRegistration(config.registrationId!!, request)

            if (!response.isInstanceRegistered) {
                return false
            }
        } catch (e: RetrofitError) {
            logger.error("Error reaching cloud service for instance {}", config.registrationId, e)
            return true
        }
        logger.info("Successfully registered for instance {}", config.registrationId)
        return true
    }

}