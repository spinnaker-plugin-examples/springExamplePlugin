package io.armory.plugin.example.spring

import com.netflix.spinnaker.orca.capabilities.CapabilitiesService
import dev.minutest.junit.JUnit5Minutests
import dev.minutest.rootContext
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class NewServiceTest : JUnit5Minutests {

    class StubCapabilitiesService : CapabilitiesService(null, null)

    fun tests() = rootContext {
        test("execute new service") {
            expectThat(NewService(StubCapabilitiesService(), NewProperties()).test())
                    .isEqualTo(
                            listOf("new service", "works")
                    )
        }
    }
}
