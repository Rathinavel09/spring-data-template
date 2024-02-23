package com.rath.springdatatemplate.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthCheckController {

    @GetMapping("/check/ping")
    public ResponseEntity<String> getHealthCheck(){
        return ResponseEntity.ok("pong");
    }

}
