package com.armory.plugin.example.spring

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/new/service")
class NewController(private val newService: NewService) {

    @GetMapping("/expressionFunctionNames")
    fun expressionFuntionNames(): Collection<String> {
        return newService.expressionFunctionNames()
    }

    @GetMapping("/test")
    fun test(): Collection<String> {
        return newService.test()
    }

    @GetMapping("/config")
    fun config(): NewConfiguration {
        return newService.config()
    }

    @GetMapping("/configBean")
    fun configBean(): NewConfigurationBean {
        return newService.configBean()
    }
}
