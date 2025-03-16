package com.devtiro.task.app.services.impl;

import com.devtiro.task.app.domain.entities.TaskList;
import com.devtiro.task.app.repositories.TaskListRepository;
import com.devtiro.task.app.services.TaskListService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskListServiceImpl implements TaskListService {

    private final TaskListRepository taskListRepository;

    public TaskListServiceImpl(TaskListRepository taskListRepository) {
        this.taskListRepository = taskListRepository;
    }


    @Override
    public List<TaskList> listTaskLists() {
        return taskListRepository.findAll();
    }
}
