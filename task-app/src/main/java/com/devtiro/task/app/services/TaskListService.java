package com.devtiro.task.app.services;

import com.devtiro.task.app.domain.entities.TaskList;

import java.util.List;

public interface TaskListService {
    List<TaskList> listTaskLists();
}
