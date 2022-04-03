package artemissoftware.com.plugins

import artemissoftware.com.routes.getAllHeroes
import artemissoftware.com.routes.root
import io.ktor.routing.*
import io.ktor.application.*

fun Application.configureRouting() {

    routing {

        root()
        getAllHeroes()
    }
}
