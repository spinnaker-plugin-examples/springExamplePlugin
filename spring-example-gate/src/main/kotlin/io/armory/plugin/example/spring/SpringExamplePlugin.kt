package io.armory.plugin.example.spring

import com.netflix.spinnaker.kork.plugins.api.spring.PrivilegedSpringPlugin
import org.pf4j.PluginWrapper
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.support.BeanDefinitionRegistry

class SpringExamplePlugin(wrapper: PluginWrapper) : PrivilegedSpringPlugin(wrapper) {

    private val logger = LoggerFactory.getLogger(SpringExamplePlugin::class.java)

    // try to set the registry manually
    override fun registerBeanDefinitions(registry: BeanDefinitionRegistry?) {
        listOf(
            // Required for the NewService controller
            beanDefinitionFor(NewProperties::class.java),
            beanDefinitionFor(NewService::class.java),
            beanDefinitionFor(NewController::class.java)
            //   Required for instance registration
//            beanDefinitionFor(ArmoryConfig::class.java),
//            beanDefinitionFor(IamConfig::class.java),
//            beanDefinitionFor(ApiConfig::class.java),
//            beanDefinitionFor(MessagingManager::class.java),
//            beanDefinitionFor(RegistrationDataManager::class.java),
//            beanDefinitionFor(CloudServiceFactory::class.java),
//            beanDefinitionFor(MessagingController::class.java),
//            beanDefinitionFor(RegistrationVerificationMessenger::class.java)
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
