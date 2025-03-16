package com.devtiro.task.mappers;

import com.devtiro.task.app.domain.dto.TaskListDto;
import com.devtiro.task.app.domain.entities.TaskList;

public interface TaskListMapper {
    TaskList fromDto(TaskListDto taskListDto);
    TaskListDto toDto(TaskList taskList);
}
