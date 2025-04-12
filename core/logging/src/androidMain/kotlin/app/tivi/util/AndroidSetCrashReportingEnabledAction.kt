// Copyright 2023, Christopher Banes and the Tivi project contributors
// SPDX-License-Identifier: Apache-2.0

package app.tivi.util

import co.touchlab.kermit.Logger

internal object AndroidSetCrashReportingEnabledAction : SetCrashReportingEnabledAction {
  private val logger by lazy { Logger.withTag("AndroidSetCrashReportingEnabledAction") }

  override fun invoke(enabled: Boolean) {
    Logger.i("Crashlytics disabled for local build")
  }
}
