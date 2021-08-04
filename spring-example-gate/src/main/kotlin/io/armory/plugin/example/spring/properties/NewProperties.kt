package io.armory.plugin.example.spring.properties

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties("newproperties")
data class NewProperties(
        var test: String? = null
)
