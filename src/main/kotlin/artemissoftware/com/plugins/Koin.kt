package artemissoftware.com.plugins

import artemissoftware.com.di.koinModule
import io.ktor.application.*
import org.koin.ktor.ext.Koin
import org.koin.logger.slf4jLogger

fun Application.configureKoin(){
    install(Koin){
        slf4jLogger(level = org.koin.core.logger.Level.ERROR) //This params are the workaround itself
        modules(koinModule)
    }
}