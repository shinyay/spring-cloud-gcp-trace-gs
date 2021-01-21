package com.google.shinyay.service

import com.google.shinyay.logger
import org.springframework.cloud.sleuth.annotation.NewSpan
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import kotlin.random.Random

@Service
class ClientService() {

    @NewSpan
    fun callHelloService(): String? {
        logger.info("Start-ClientService: ${ZonedDateTime.now(ZoneId.of("Japan")).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"))}")

        val resultList = mutableListOf<String>()
        repeat(Random.nextInt(1, 5)) {
            resultList.add(RestTemplate().getForObject("http://localhost:8080/api/v1/hello", String::class.java).toString())
        }
        logger.info("Result: $resultList")
        return resultList.toString()
    }
}