package com.google.shinyay.controller

import com.google.shinyay.service.HelloService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1")
class HelloController(val service: HelloService) {

    @GetMapping("/hello")
    fun hello(): String = service.hello()
}