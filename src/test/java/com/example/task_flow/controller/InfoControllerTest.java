package com.example.task_flow.controller;

import com.example.task_flow.dto.InfoResponse;
import com.example.task_flow.dto.StatusResponse;
import com.example.task_flow.service.InfoService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(InfoController.class)
@DisplayName("InfoController integration test")
public class InfoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private InfoService service;

    @Test
    void getInfo() throws Exception {
        when(service.getInfo())
                .thenReturn(new InfoResponse());

        mockMvc.perform(get("/api/v1/info"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("TaskFlow"))
                .andExpect(jsonPath("$.description").value("Task & Project manager"))
                .andExpect(jsonPath("$.version").value("1.0.0"));
    }

    @Test
    void getStatus() throws Exception {
        when(service.getStatus())
                .thenReturn(new StatusResponse());

        mockMvc.perform(get("/api/v1/info/status"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.status").value("UP"));
    }
}
