/*
 * Copyright (c) 2021 Touchlab
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 */

package co.touchlab.kermitsample

import co.touchlab.kermit.Logger

class SampleCommon(private val logger: Logger = Logger) {
    private var count = 0
    fun onClick() {
        count++
        logger.i { "Common click count: $count" }
    }

    fun logException() {
        logger.w(throwable = Exception("Handled")) { "Common click count: $count" }
    }
}