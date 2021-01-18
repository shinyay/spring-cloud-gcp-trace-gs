package com.google.shinyay.service

import com.google.shinyay.logger
import org.springframework.stereotype.Service
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

@Service
class HelloService {

    fun hello(): String {
        val dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")
        val currentTime = ZonedDateTime.now(ZoneId.of("Japan")).format(dateFormat)
        logger.info("Current Time: $currentTime")
        return "Hello at $currentTime"
    }
}