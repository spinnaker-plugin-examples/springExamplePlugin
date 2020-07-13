package io.armory.plugin.example.spring

import com.netflix.spinnaker.kork.plugins.api.spring.SpringLoaderCustomInit
import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.stereotype.Component

@Component
class MyCustomInit : SpringLoaderCustomInit() {
    override fun init(appContext: AnnotationConfigServletWebServerApplicationContext, pluginContext: AnnotationConfigApplicationContext) {
        println("My custom Spring init.")
    }
}
