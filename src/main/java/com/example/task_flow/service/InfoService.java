package com.example.task_flow.service;

import com.example.task_flow.dto.InfoResponse;
import com.example.task_flow.dto.StatusResponse;
import org.springframework.stereotype.Service;

@Service
public class InfoService {

    public InfoResponse getInfo() {
        return new InfoResponse();
    }

    public StatusResponse getStatus() {
        return new StatusResponse();
    }
}
