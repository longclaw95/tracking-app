package com.devtiro.task.app.services.impl;

import com.devtiro.task.app.domain.entities.Task;
import com.devtiro.task.app.repositories.TaskRepository;
import com.devtiro.task.app.services.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public List<Task> listTasks(UUID taskListId) {
        return taskRepository.findByTaskListId(taskListId);
    }
}
