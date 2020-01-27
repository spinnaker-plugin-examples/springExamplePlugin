package io.armory.plugin.example.spring

import io.pivotal.canal.model.Pipelines
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController()
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

    @GetMapping("/pipelines")
    fun pipelines(): Pipelines {
        return newService.pipelines()
    }

}
