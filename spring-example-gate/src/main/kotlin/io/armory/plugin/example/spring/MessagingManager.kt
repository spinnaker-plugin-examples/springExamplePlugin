package io.armory.plugin.example.spring

import org.apache.logging.log4j.util.Strings
import kotlin.collections.HashMap
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component

@Component
class MessagingManager (
    var messengers: List<Messenger>
) {

    var messageMap = HashMap<String, BannerMessage>()
    private val logger = LoggerFactory.getLogger(RegistrationVerificationMessenger::class.java)

    fun getMessages(): MutableCollection<BannerMessage> {
        for (messenger in messengers) {
            logger.debug("Fetching banner message for {}", messenger.getName())
            val bannerMessage = messenger.fetchMessage()
            if (notNullOrEmpty(bannerMessage)) {
                logger.debug("Banner message found for {}", messenger.getName())
                messageMap[bannerMessage.message] = bannerMessage
            }
        }
        return messageMap.values
    }

    fun notNullOrEmpty(bannerMessage: BannerMessage): Boolean {
        return (bannerMessage != null && Strings.isNotBlank(bannerMessage.message))
    }

}