package com.github.grusu94.gh.another.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
public class AnotherController {

    @GetMapping(value = "/users/{userId}")
    public String greetingsFrom (@PathVariable Integer userId) {
        return "Hello from another userId " + userId;
    }
}
