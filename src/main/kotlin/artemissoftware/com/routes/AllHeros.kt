package artemissoftware.com.routes

import artemissoftware.com.models.ApiResponse
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

fun Route.getAllHeroes(){

    get("/charactes/heroes") {
        try {
            val page = call.request.queryParameters["page"]?.toInt() ?: 1
            //println("NEW PAGE: $page")
            require(page in 1..5)
            call.respond(
                message = page
            )

//            val apiResponse = heroRepository.getAllHeroes(page = page)
//            call.respond(
//                message = apiResponse,
//                status = HttpStatusCode.OK
//            )
        } catch (e: NumberFormatException) {
            call.respond(
                message = ApiResponse(success = false, message = "Only Numbers Allowed."),
                status = HttpStatusCode.BadRequest
            )
        } catch (e: IllegalArgumentException) {
            call.respond(
                message = ApiResponse(success = false, message = "Heroes not Found."),
                status = HttpStatusCode.NotFound
            )
        }
    }
}