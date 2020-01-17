package com.armory.plugin.example.spring

import com.netflix.spinnaker.orca.capabilities.CapabilitiesService

import io.pivotal.canal.extensions.nestedstages.stages
import io.pivotal.canal.extensions.pipelines
import io.pivotal.canal.model.Pipelines
import io.pivotal.canal.model.Wait

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

    // uses 3rd party library that is not in Spinnaker
    fun pipelines(): Pipelines {
        return pipelines {
            app("app1") {
                pipeline("just waiting") {
                    stages = stages {
                        stage(Wait(420))
                    }
                }
            }
        }
    }

}
