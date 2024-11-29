package com.example.springfluxdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringFluxDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringFluxDemoApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "TASK DONE!! Welcome to Hati Intl.";
    }
}
