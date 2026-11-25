package com.example.task_flow.dto;

public record InfoResponse(String name, String description, String version) {
    public InfoResponse() {
        this("TaskFlow", "Task & Project manager", "1.0.0");
    }
}
