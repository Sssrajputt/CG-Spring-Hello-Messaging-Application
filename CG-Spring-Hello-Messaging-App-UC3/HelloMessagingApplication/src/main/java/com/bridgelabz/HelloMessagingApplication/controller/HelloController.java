package com.bridgelabz.HelloMessagingApplication.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String getHello() {
        return "Hello from BridgeLabz (GET)";
    }

    @PostMapping
    public String postHello() {
        return "Hello from BridgeLabz (POST)";
    }

    @PutMapping
    public String putHello() {
        return "Hello from BridgeLabz (PUT)";
    }

    @DeleteMapping
    public String deleteHello() {
        return "Hello from BridgeLabz (DELETE)";
    }

    @GetMapping("/query")
    public String sayHelloWithName(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    @GetMapping("/param/{name}")
    public String sayHelloWithPathVariable(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}
