package com.example.task_flow.controller;

import com.example.task_flow.dto.InfoResponse;
import com.example.task_flow.dto.StatusResponse;
import com.example.task_flow.service.InfoService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1")
public class InfoController {

    private final InfoService service;

    public InfoController(InfoService service) {
        this.service = service;
    }

    @GetMapping("/info")
    public ResponseEntity<InfoResponse> getInfo() {
        var info = service.getInfo();
        return ResponseEntity.ok(info);
    }

    @GetMapping("/info/status")
    public ResponseEntity<StatusResponse> getStatus() {
        var status = service.getStatus();
        return ResponseEntity.ok(status);
    }
}
