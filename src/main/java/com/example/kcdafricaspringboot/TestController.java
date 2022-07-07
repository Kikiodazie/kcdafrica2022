package com.example.kcdafricaspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String index(){
        return "<h1>Hello world!</h1>";
    }

    @GetMapping("/name")
    public String getName(){
        return "<h1> My name is Divine Odazie!!</h1>";
    }

}
