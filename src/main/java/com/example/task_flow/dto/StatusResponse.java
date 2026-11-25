package com.example.task_flow.dto;

public record StatusResponse(String status) {
    public StatusResponse() {
        this("UP");
    }
}
