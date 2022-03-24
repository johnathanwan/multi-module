package com.example.service

import org.springframework.boot.context.properties.ConfigurationProperties

@Suppress("unused")
@ConfigurationProperties("service")
class ServiceProperties {
    var message: String? = null
}