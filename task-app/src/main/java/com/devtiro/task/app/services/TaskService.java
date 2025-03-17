package com.devtiro.task.app.services;

import com.devtiro.task.app.domain.entities.Task;

import java.util.List;
import java.util.UUID;

public interface TaskService {
    List<Task> listTasks(UUID taskListId);

}
