package io.armory.plugin.example.spring

import com.netflix.spinnaker.kork.plugins.api.spring.SpringLoaderPlugin
import io.armory.plugin.example.spring.services.MyAmazonS3
import io.armory.plugin.example.spring.services.MyS3StorageService
import org.pf4j.PluginWrapper
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.support.BeanDefinitionRegistry

class SpringExamplePlugin(wrapper: PluginWrapper) : SpringLoaderPlugin(wrapper) {

    private val logger = LoggerFactory.getLogger(SpringExamplePlugin::class.java)

    override fun getPackagesToScan(): List<String> {
        return listOf(
                "io.armory.plugin.example.spring"
        )
    }

    override fun registerBeanDefinitions(registry: BeanDefinitionRegistry?) {
        super.registerBeanDefinitions(registry)
        listOf(
            primaryBeanDefinitionFor(MyAmazonS3::class.java),
            primaryBeanDefinitionFor(MyS3StorageService::class.java)
        ).forEach {
            registerBean(it, registry)
        }
    }

    override fun start() {
        logger.info("SpringExamplePlugin.start()")
    }

    override fun stop() {
        logger.info("SpringExamplePlugin.stop()")
    }
}
