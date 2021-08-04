package io.armory.plugin.example.spring

import dev.minutest.junit.JUnit5Minutests
import dev.minutest.rootContext
import io.armory.plugin.example.spring.properties.NewProperties
import io.armory.plugin.example.spring.services.NewService
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class NewServiceTest : JUnit5Minutests {

    fun tests() = rootContext {
        test("execute new service") {
            expectThat(NewService(NewProperties()).test())
                    .isEqualTo(
                            listOf("new service", "works")
                    )
        }
    }
}
