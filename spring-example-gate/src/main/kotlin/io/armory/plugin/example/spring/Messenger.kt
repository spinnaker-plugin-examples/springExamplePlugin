package io.armory.plugin.example.spring

interface Messenger {
    fun fetchMessage(): BannerMessage
    fun getName(): String
}