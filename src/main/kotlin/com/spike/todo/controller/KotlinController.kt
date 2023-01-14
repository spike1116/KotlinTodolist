package com.spike.todo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class KotlinController {
    @GetMapping("/hello")
    fun hello():String{
        return "Hello World"
    }
}
