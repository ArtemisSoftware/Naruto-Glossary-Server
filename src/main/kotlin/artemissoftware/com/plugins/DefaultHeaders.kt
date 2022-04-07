package artemissoftware.com.plugins

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.http.*
import java.time.Duration

fun Application.configureDefaultHeader() {
    install(DefaultHeaders) {
        val oneYearInSeconds = Duration.ofDays(365).seconds
        header(
            name = HttpHeaders.CacheControl,
            value = "public, max-age=$oneYearInSeconds, immutable" //if not available the images on the android app will not load when there is no internet
        )
    }
}