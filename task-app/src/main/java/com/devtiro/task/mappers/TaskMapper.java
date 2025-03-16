package com.devtiro.task.mappers;

import com.devtiro.task.app.domain.dto.TaskDto;
import com.devtiro.task.app.domain.entities.Task;

public interface TaskMapper {
    Task fromDto(TaskDto taskDto);
    TaskDto toDto(Task task);
}
