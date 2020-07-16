package io.armory.plugin.example.spring

import com.netflix.spinnaker.kork.plugins.api.spring.SpringLoaderPlugin
import org.pf4j.PluginWrapper
import org.slf4j.LoggerFactory

class SpringExamplePlugin(wrapper: PluginWrapper) : SpringLoaderPlugin(wrapper) {

    private val logger = LoggerFactory.getLogger(SpringExamplePlugin::class.java)

    override fun getPackagesToScan(): List<String> {
        return listOf(
                "io.armory.plugin.example.spring"
        )
    }

    override fun start() {
        logger.info("SpringExamplePlugin.start()")
    }

    override fun stop() {
        logger.info("SpringExamplePlugin.stop()")
    }
}
