package io.armory.plugin.example.spring.controllers

import io.armory.plugin.example.spring.properties.NewProperties
import io.armory.plugin.example.spring.services.NewService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/new/service")
class NewController(private val newService: NewService) {

    @GetMapping("/expressionFunctionNames")
    fun expressionFuntionNames(): Collection<String> {
        return newService.expressionFunctionNames()
    }

    @GetMapping("/test")
    fun test(): Collection<String> {
        return newService.test()
    }

    @GetMapping("/properties")
    fun properties(): NewProperties {
        return newService.properties()
    }

}
