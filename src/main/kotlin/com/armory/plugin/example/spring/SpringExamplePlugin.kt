package com.armory.plugin.example.spring

import com.netflix.spinnaker.kork.plugins.api.spring.SpringPlugin
import org.slf4j.LoggerFactory
import org.pf4j.PluginWrapper


class SpringExamplePlugin(wrapper: PluginWrapper) : SpringPlugin(wrapper) {
    override fun initApplicationContext() {
        applicationContext.applicationName
        logger.info("***** App name ${applicationContext.applicationName}")
        logger.info(applicationContext.environment.toString())
        logger.info(applicationContext.beanDefinitionNames.joinToString())

        applicationContext.register(NewConfiguration::class.java)
        applicationContext.register(NewConfigurationBean::class.java)
        applicationContext.register(NewProperties::class.java)
        applicationContext.register(NewService::class.java)
        applicationContext.register(NewController::class.java)
        applicationContext.register(OverrideService::class.java)

        logger.info(applicationContext.beanDefinitionNames.joinToString())
    }

    private val logger = LoggerFactory.getLogger(SpringExamplePlugin::class.java)

    override fun start() {
        logger.info("SpringExamplePlugin.start()")
    }

    override fun stop() {
        logger.info("SpringExamplePlugin.stop()")
    }
}
