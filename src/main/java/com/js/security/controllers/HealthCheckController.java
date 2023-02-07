package com.js.security.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/api/health")
public class HealthCheckController {

    @GetMapping()
    public ResponseEntity<HashMap<String, String>> health() {
        HashMap<String, String> healthCheck = new HashMap<String, String>();
        healthCheck.put("message", "Hello World");
        healthCheck.put("status", "OK");
        return new ResponseEntity<>(healthCheck, HttpStatus.OK);
    }
}
