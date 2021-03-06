package com.hexagonkt.logging

import com.hexagonkt.injection.InjectionManager.injectOrNull
import com.hexagonkt.logging.jul.JulLoggingAdapter

object LoggingManager {
    var adapter: LoggingPort = injectOrNull() ?: JulLoggingAdapter
}
