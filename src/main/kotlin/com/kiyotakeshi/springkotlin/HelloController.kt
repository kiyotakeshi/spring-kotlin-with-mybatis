package com.kiyotakeshi.springkotlin

//import org.springframework.stereotype.Controller
//import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

//@Controller
//@RequestMapping("/")
//class HelloController {
//
//    @GetMapping
//    fun index(model: Model): String {
//        model.addAttribute("message", "Hello Kotlin!")
//        return "index"
//    }
//}

//@RestController
//@RequestMapping("/")
//class HelloController {
//
//    // http://localhost:8080/greeter?name=taro
//    @GetMapping("hello")
//    fun queryStringGreeter(@RequestParam("name") name: String): HelloResponse {
//        return HelloResponse("Hello $name")
//    }
//
//    // http://localhost:8080/hello/taro
//    @GetMapping("hello/{name}")
//    fun pathParameterGreeter(@PathVariable("name") name: String): HelloResponse {
//        return HelloResponse("Hello $name")
//    }
//
//    // curl -H 'Content-Type:application/json' -X POST -d '{"name":"mike"}' http://localhost:8080/hello
//    @PostMapping("hello")
//    fun postRequest(@RequestBody request: HelloResponse): HelloResponse{
//        return HelloResponse("Hello ${request.name}")
//    }
//}
