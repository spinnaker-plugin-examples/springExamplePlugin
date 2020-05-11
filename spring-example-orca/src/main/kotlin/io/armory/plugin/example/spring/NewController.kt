package io.armory.plugin.example.spring

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController()
@RequestMapping("/new/service")
class NewController(private val newService: NewService, private val serviceFromFactory: ServiceFromFactory) {

    @GetMapping("/expressionFunctionNames")
    fun expressionFuntionNames(): Collection<String> {
        return newService.expressionFunctionNames()
    }

    @GetMapping("/test")
    fun test(): Collection<String> {
        return newService.test()
    }

    @GetMapping("/test2")
    fun test2(): String? {
        return serviceFromFactory.value
    }

    @GetMapping("/properties")
    fun properties(): NewProperties {
        return newService.properties()
    }

}
