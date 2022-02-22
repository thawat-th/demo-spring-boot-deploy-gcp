package com.example.demospringboottogcp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${message}")
    String message;

    @GetMapping(value = "demo")
    public ResponseEntity<String> displayHelloMessage() {
        return ResponseEntity.ok(message);
    }
}