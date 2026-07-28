package com.studyos.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studyos.dto.ApiResponse;

@RestController
public class HealthController {

    @GetMapping("/api/v1/health")
    public ApiResponse<String> health() {

        ApiResponse<String> response = new ApiResponse<>();

        response.setSuccess(true);
        response.setMessage("Application is running successfully");
        response.setData("StudyOS Backend is healthy");
        response.setTimestamp(LocalDateTime.now());

        return response;
    }
}