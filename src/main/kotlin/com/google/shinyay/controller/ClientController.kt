package com.google.shinyay.controller

import com.google.shinyay.service.ClientService
import org.springframework.web.bind.annotation.RestController

@RestController
class ClientController(val service: ClientService) {
}