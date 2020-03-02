package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConventionController {

    @GetMapping("/students")
    public Student getStudent () {
        return new Student("john", 21, "010-1234-1234");
    }
}
