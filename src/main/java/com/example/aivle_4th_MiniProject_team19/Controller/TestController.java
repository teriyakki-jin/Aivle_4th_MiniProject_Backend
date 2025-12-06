package com.example.aivle_4th_MiniProject_team19.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
@RequestMapping("/api/health")
public class TestController {

    @GetMapping
    public ApiResponse<Map<String, Object>> checkHealth() {
        Map<String, Object> payload = Map.of(
                "status", "ok",
                "message", "백엔드 API 연결 성공",
                "timestamp", LocalDateTime.now().toString()
        );

        return ApiResponse.of(payload);
    }
}
