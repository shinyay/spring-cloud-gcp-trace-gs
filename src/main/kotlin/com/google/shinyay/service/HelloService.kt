package com.google.shinyay.service

import com.google.shinyay.logger
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.springframework.stereotype.Service
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import kotlin.random.Random

@Service
class HelloService {

    fun hello(): String {
        runBlocking {
            blockFunction()
        }
        val dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")
        val currentTime = ZonedDateTime.now(ZoneId.of("Japan")).format(dateFormat)
        logger.info("Current Time: $currentTime")
        return "Hello at $currentTime"
    }

    suspend fun blockFunction() {
        logger.info("Start-HelloService: ${ZonedDateTime.now(ZoneId.of("Japan")).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"))}")
        val randomValue = Random.nextLong(1000, 2000)
        delay(randomValue)
        logger.info("Delay: $randomValue")
    }
}