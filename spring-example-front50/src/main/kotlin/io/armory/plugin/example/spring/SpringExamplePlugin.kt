package io.armory.plugin.example.spring

import com.netflix.spinnaker.kork.plugins.api.spring.SpringLoader
import com.netflix.spinnaker.kork.plugins.api.spring.SpringLoaderPlugin
import org.pf4j.PluginWrapper
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.support.BeanDefinitionRegistry
import java.util.*

class SpringExamplePlugin(wrapper: PluginWrapper) : SpringLoaderPlugin(wrapper) {

    private val logger = LoggerFactory.getLogger(SpringExamplePlugin::class.java)

    override fun getPackagesToScan(): List<String> {
        return listOf(
                "io.armory.plugin.example.spring"
        )
    }

    override fun registerBeanDefinitions(registry: BeanDefinitionRegistry?) {
        super.registerBeanDefinitions(registry)

        // delay injection until after the plugin has a chance to load its own beans
        val springLoaderBeanName = wrapper.pluginId + "." + SpringLoader::class.java.name
        listOf(
                "deliveryRepository",
                "applicationPermissionDAO",
                "notificationDAO",
                "defaultObjectKeyLoader",
                "entityTagsDAO",
                "pipelineTemplateDAO",
                "pluginInfoRepository",
                "snapshotDAO",
                "pipelineStrategyDAO",
                "pluginVersionPinningRepository",
                "projectDAO",
                "applicationDAO",
                "compositeStorageServiceConfiguration",
                "serviceAccountDAO",
                "pipelineDAO"
        ).forEach {
            val dependentBeanDef = registry!!.getBeanDefinition(it)
            val mappingDependsOn = dependentBeanDef.dependsOn?.toList() ?: emptyList()
            dependentBeanDef.setDependsOn(
                    *(mappingDependsOn + springLoaderBeanName).filterNotNull().toTypedArray()
            )
        }
    }

    override fun start() {
        logger.info("SpringExamplePlugin.start()")
    }

    override fun stop() {
        logger.info("SpringExamplePlugin.stop()")
    }
}
