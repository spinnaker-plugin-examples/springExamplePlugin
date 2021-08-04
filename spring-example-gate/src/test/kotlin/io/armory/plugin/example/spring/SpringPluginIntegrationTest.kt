/*
 * Copyright 2020 Armory, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.armory.plugin.example.spring

import com.netflix.spinnaker.gate.api.test.gateFixture
import dev.minutest.junit.JUnit5Minutests
import dev.minutest.rootContext
import org.springframework.test.web.servlet.get
import strikt.api.expect
import strikt.assertions.isEqualTo

class SpringPluginIntegrationTest : JUnit5Minutests {

  fun tests() = rootContext<GatePluginsFixture> {
    context("a running Orca instance") {
      gateFixture {
        GatePluginsFixture()
      }

      test("test") {
        val response = mockMvc.get("/new/service/test").andReturn().response

        expect {
          that(response.status).isEqualTo(200)
        }

      }
    }
  }

}