package com.example.service

import org.springframework.boot.context.properties.*
import org.springframework.stereotype.*

@Suppress("unused")
@Service
@EnableConfigurationProperties(ServiceProperties::class)
class MyService(val serviceProperties: ServiceProperties) {

    fun message() = serviceProperties.message
}