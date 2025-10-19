package com.example.billingservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class BillingServiceApplication

fun main(args: Array<String>) {
    runApplication<BillingServiceApplication>(*args)
}

@RestController
class HealthController {
    @GetMapping("/health")
    fun health() = mapOf("status" to "UP", "service" to "billing-service")
}
