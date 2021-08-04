package io.armory.plugin.example.spring

class VerificationResponse (
    var isInstanceRegistered: Boolean = true,
    var featureSpecific: Map<String, Any>?
)