package com.armory.plugin.example.spring

import com.netflix.spinnaker.orca.capabilities.CapabilitiesService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class NewService {

    @Autowired
    internal var capabilitiesService: CapabilitiesService? = null

    @Autowired
    internal var newConfiguration: NewConfiguration? = null

    @Autowired
    internal var newConfigurationBean: NewConfigurationBean? = null

    fun expressionFunctionNames(): Collection<String> {
        return capabilitiesService!!.getExpressionCapabilities().functions.map{it.name}
    }

    fun test(): Collection<String> {
        return listOf("new service", "works")
    }

    fun config(): NewConfiguration {
        return newConfiguration!!
    }

    fun configBean(): NewConfigurationBean {
        return newConfigurationBean!!
    }

}