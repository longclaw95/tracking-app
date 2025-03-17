package com.devtiro.task.app.domain.dto;

public record ErrorResponse(
        int status,
        String message,
        String details
) {
}
