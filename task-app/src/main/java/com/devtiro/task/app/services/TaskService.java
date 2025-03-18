package com.devtiro.task.app.services;

import com.devtiro.task.app.domain.entities.Task;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TaskService {
    List<Task> listTasks(UUID taskListId);
    Task createTask(UUID taskListId,Task task);
    Optional<Task> getTask(UUID taskListId, UUID taskId);
    Task updateTask(UUID taskListId, UUID taskId, Task task);
}
