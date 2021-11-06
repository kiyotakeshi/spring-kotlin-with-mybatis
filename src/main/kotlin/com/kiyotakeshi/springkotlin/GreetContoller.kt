package com.kiyotakeshi.springkotlin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
class GreetController(
    private val greeter: Greeter
) {
    // フィールドインジェクションだと後からインジェクトされるため lateinit var
    // private lateinit var greeter: Greeter
    @GetMapping("hello/{name}")
    fun hello(@PathVariable("name") name: String): HelloResponse {
        return HelloResponse("Hello $name")
    }
}
