package io.armory.plugin.example.spring.properties

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("newproperties")
data class NewProperties(
        var test: String? = null
)
