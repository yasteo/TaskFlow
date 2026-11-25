package com.example.task_flow.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
@DisplayName("InfoService unit tests")
public class InfoServiceTest {

    private InfoService service;

    @BeforeEach()
    void setUp() {
        this.service = new InfoService();
    }

    @Test
    void getInfo() {
        // Given

        // When
        var response = service.getInfo();

        // Then
        assertNotNull(response);
        assertEquals("TaskFlow", response.name());
        assertEquals("Task & Project manager", response.description());
        assertEquals("1.0.0", response.version());
    }

    @Test
    void getStatus() {
        // Given

        // When
        var status = service.getStatus();

        // Then
        assertNotNull(status);
        assertEquals("UP", status.status());
    }
}
