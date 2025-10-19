package com.example.auditservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class AuditServiceApplication

fun main(args: Array<String>) {
    runApplication<AuditServiceApplication>(*args)
}

@RestController
class HealthController {
    @GetMapping("/health")
    fun health() = mapOf("status" to "UP", "service" to "audit-service")
}
