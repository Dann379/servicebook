/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servicebook.servicebook.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Usuario
 */
@RestController
@RequestMapping("/api")

public class HealthController {
    @GetMapping("/health")
    public Map<String, Object> health(){
        Map<String, Object> res = new HashMap<>();
        res.put("status", "Ok");
        res.put("timestamp", Instant.now().toString());
        return res;
    }
}
