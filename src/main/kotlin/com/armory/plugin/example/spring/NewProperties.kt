package com.armory.plugin.example.spring

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("newproperties")
data class NewProperties(
        var test: String? = null
)
