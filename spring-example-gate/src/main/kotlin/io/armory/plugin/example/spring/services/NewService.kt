package io.armory.plugin.example.spring.services

import io.armory.plugin.example.spring.properties.NewProperties
import org.springframework.stereotype.Component

@Component
class NewService(val newProperties: NewProperties) {

    fun test(): Collection<String> {
        return listOf("new service", "works")
    }

    fun properties(): NewProperties {
        return newProperties
    }

}
