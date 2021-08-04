package io.armory.plugin.example.spring

import io.armory.plugin.example.spring.NewProperties

class NewService(val newProperties: NewProperties) {

    fun test(): Collection<String> {
        return listOf("new service", "works")
    }

    fun properties(): NewProperties {
        return newProperties
    }

}
