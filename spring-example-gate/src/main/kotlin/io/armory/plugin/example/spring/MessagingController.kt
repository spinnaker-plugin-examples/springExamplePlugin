package io.armory.plugin.example.spring

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/armory/messaging/api")
class MessagingController (
    val messagingManager: MessagingManager,
    val registrationDataManager: RegistrationDataManager
) {
    @GetMapping("/v1/poll")
    fun checkForMessages(): MutableCollection<BannerMessage>? {
        return messagingManager.getMessages()
    }

    @GetMapping("/v1/feature-specific")
    fun getFeatureSpecific(): VerificationResponse {
        return registrationDataManager.getFeatureSpecific()
    }
}