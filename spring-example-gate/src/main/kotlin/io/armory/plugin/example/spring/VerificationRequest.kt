package io.armory.plugin.example.spring

import java.time.OffsetDateTime

class VerificationRequest (
    val knownUsers: Number? = null,
    val feature: String? = null,
    val version: String? = null,
    val timestamp: OffsetDateTime? = null,
    val installationSource: String? = null
) {
}