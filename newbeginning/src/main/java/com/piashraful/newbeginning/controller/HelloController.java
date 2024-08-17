package com.piashraful.newbeginning.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "hello piash";
    }

    @GetMapping("/hi")
    public String hiWorld() {
        return "hi piash";
    }
    
}
