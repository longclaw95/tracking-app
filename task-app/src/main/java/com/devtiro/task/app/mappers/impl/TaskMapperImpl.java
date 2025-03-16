package com.devtiro.task.app.mappers.impl;

import com.devtiro.task.app.domain.dto.TaskDto;
import com.devtiro.task.app.domain.entities.Task;
import com.devtiro.task.app.mappers.TaskMapper;
import org.springframework.stereotype.Component;


@Component
public class TaskMapperImpl implements TaskMapper {

    @Override
    public Task fromDto(TaskDto taskDto) {
        return new Task(
                taskDto.id(),
                taskDto.title(),
                taskDto.description(),
                taskDto.dueDate(),
                taskDto.status(),
                taskDto.priority(),
                null,
                null,
                null

        );
    }

    @Override
    public TaskDto toDto(Task task) {
        return new TaskDto(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getDue_date(),
                task.getPriority(),
                task.getStatus()
        );
    }
}
