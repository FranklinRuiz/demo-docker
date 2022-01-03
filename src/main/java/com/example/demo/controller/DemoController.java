package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/demo")
public class DemoController {

    @GetMapping("/name/{name}")
    public String getNombre(@PathVariable String name) {
        String n = "-----";
        if (!name.isEmpty()) {
            n = name;
        }
        return "Hola " + n;
    }

}
