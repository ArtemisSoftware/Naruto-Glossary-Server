package artemissoftware.com.plugins

import artemissoftware.com.routes.getAllHeroes
import artemissoftware.com.routes.getAllHeroesAlternative
import artemissoftware.com.routes.root
import artemissoftware.com.routes.searchHeroes
import io.ktor.application.*
import io.ktor.http.content.*
import io.ktor.routing.*

fun Application.configureRouting() {

    routing {

        root()
        getAllHeroes()
        //getAllHeroesAlternative()
        searchHeroes()

        static("/images"){ //to access images
            resources("images")
        }
    }
}
