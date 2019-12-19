package com.armory.plugin.example.spring

import com.netflix.spinnaker.orca.StageResolver
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ConditionalOnProperty("newproperties.enabled")
@ComponentScan("com.armory.plugin.example.spring")
@EnableConfigurationProperties(NewProperties::class)
open class NewConfiguration {

    @Bean
    fun newConfigurationBean(
            stageResolver: StageResolver
    ): NewConfigurationBean {
        return NewConfigurationBean(stageResolver)
    }

}

class NewConfigurationBean(val stageResolver: StageResolver) {
}
