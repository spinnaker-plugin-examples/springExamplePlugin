package io.armory.plugin.example.spring

import org.springframework.beans.factory.config.AbstractFactoryBean

class ServiceFactory(val newProperties: NewProperties) : AbstractFactoryBean<ServiceFromFactory>() {
    override fun createInstance(): ServiceFromFactory {
        return ServiceFromFactory(newProperties.test)
    }

    override fun getObjectType(): Class<*>? {
        return ServiceFromFactory::class.java
    }
}


class ServiceFromFactory(val value: String?) {

}
