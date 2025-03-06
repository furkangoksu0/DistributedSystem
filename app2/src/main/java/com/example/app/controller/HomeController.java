package com.example.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.net.InetAddress;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {

    @GetMapping("/")
    public Map<String, String> home() {
        Map<String, String> response = new HashMap<>();
        try {
            response.put("message", "Merhaba! Bu App2 sunucusundan gelen yanıt!");
            response.put("sunucu", "App2 (Port 8081)");
            response.put("hostname", InetAddress.getLocalHost().getHostName());
            response.put("zaman", LocalDateTime.now().toString());
        } catch (Exception e) {
            response.put("hata", e.getMessage());
        }
        return response;
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        Map<String, String> status = new HashMap<>();
        status.put("status", "UP");
        status.put("service", "App2");
        return status;
    }
} 