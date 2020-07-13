package io.armory.plugin.example.spring.services

import com.netflix.spinnaker.orca.capabilities.CapabilitiesService
import io.armory.plugin.example.spring.properties.NewProperties
import org.springframework.stereotype.Component

@Component
class NewService(val capabilitiesService: CapabilitiesService,
                 val newProperties: NewProperties
) {

    fun expressionFunctionNames(): Collection<String> {
        return capabilitiesService.getExpressionCapabilities().functions.map{it.name}
    }

    fun test(): Collection<String> {
        return listOf("new service", "works")
    }

    fun properties(): NewProperties {
        return newProperties
    }

}
