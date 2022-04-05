package artemissoftware.com.plugins

import artemissoftware.com.routes.getAllHeroes
import artemissoftware.com.routes.root
import io.ktor.routing.*
import io.ktor.application.*
import io.ktor.http.content.*

fun Application.configureRouting() {

    routing {

        root()
        getAllHeroes()

        static("/images"){ //to access images
            resources("images")
        }
    }
}
