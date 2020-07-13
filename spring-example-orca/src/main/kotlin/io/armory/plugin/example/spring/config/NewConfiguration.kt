package io.armory.plugin.example.spring.config

import com.netflix.spinnaker.kork.expressions.ExpressionFunctionProvider
import com.netflix.spinnaker.kork.plugins.api.spring.ExposeToApp
import io.armory.plugin.example.spring.properties.NewProperties
import io.armory.plugin.example.spring.services.OverrideService
import org.pf4j.PluginManager
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary

@Configuration
@EnableConfigurationProperties(NewProperties::class)
class NewConfiguration {

    @Bean
    @Primary
    @ExposeToApp
    // use bean name of bean you are overriding from service as method name
    fun capabilitiesService(expressionFunctionProviders: MutableList<ExpressionFunctionProvider>?,
                        pluginManager: PluginManager?): OverrideService {
        return OverrideService(expressionFunctionProviders, pluginManager)
    }

}
