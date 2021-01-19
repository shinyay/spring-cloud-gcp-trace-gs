package com.google.shinyay.service

import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.getForObject

@Service
class ClientService() {

    fun callHelloService(): String? {
        val result = RestTemplate().getForObject("http://localhost:8080/api/v1/hello", String::class.java)
        return result
    }
}