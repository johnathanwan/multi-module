package com.example.application

import com.example.service.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.*
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication(scanBasePackages = ["com.example"])
@RestController
class DemoApplication {

    @Autowired
    val myService: MyService? = null

    @GetMapping("/")
    fun home() = myService!!.message()

}

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}