package com.google.shinyay

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringCloudGcpTraceGsApplication

fun main(args: Array<String>) {
	runApplication<SpringCloudGcpTraceGsApplication>(*args)
}
