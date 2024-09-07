package com.taskmanagementapplication.app_task.controller;

import com.taskmanagementapplication.app_task.data.Task;
import com.taskmanagementapplication.app_task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    //create task
    @PostMapping(path = "/tasks")
    public Task createTask(@RequestBody Task task){
        return taskService.createTask(task);
    }

    @GetMapping(path="/tasks")
    public List<Task> findAllTask(){
        return taskService.getTasks();
    }

    @PutMapping(path = "/tasks")
    public Task updateTasks(@RequestBody Task task){
        return taskService.updateTask(task);
    }

    @PutMapping("/tasks/{id}")
    public Task updateTaskById(@PathVariable int id, @RequestBody Task task) {
        return taskService.updateTaskById(id, task);
    }

    @DeleteMapping(path = "/tasks/{id}")
    public Task deleteTaskById(@PathVariable int id) {
        return taskService.deleteTaskById(id);
    }

    @GetMapping(path ="/tasks/{title}")
    public List<Task> findTasksBytitle(@PathVariable String title) {
        return taskService.findTasksBytitle(title);

    }
}
