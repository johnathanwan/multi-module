package com.example.service

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.*
import org.springframework.boot.test.context.*

@SpringBootTest("service.message=Hello")
class MyServiceTest {

    @Autowired
    val myService: MyService? = null

    @Test
    fun contextLoads() {
        assertThat(myService!!.message()).isNotNull
    }

    @SpringBootApplication
    class TestConfiguration
}