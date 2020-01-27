package io.armory.plugin.example.spring

import com.netflix.spinnaker.kork.plugins.api.spring.PrivilegedSpringPlugin
import org.slf4j.LoggerFactory
import org.pf4j.PluginWrapper
import org.springframework.beans.factory.support.BeanDefinitionRegistry

class SpringExamplePlugin(wrapper: PluginWrapper) : PrivilegedSpringPlugin(wrapper) {

    override fun registerBeanDefinitions(registry: BeanDefinitionRegistry) {
        listOf(
                beanDefinitionFor(NewService::class.java),
                beanDefinitionFor(NewProperties::class.java),
                beanDefinitionFor(NewController::class.java),
                primaryBeanDefinitionFor(OverrideService::class.java)
        ).forEach {
            registerBean(it, registry)
        }
    }

    private val logger = LoggerFactory.getLogger(SpringExamplePlugin::class.java)

    override fun start() {
        logger.info("SpringExamplePlugin.start()")
    }

    override fun stop() {
        logger.info("SpringExamplePlugin.stop()")
    }
}
