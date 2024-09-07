package com.taskmanagementapplication.app_task.service;

import com.taskmanagementapplication.app_task.data.Task;
import com.taskmanagementapplication.app_task.data.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;



@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    public List<Task> getTasks() {
        return taskRepository.findAll();
    }

    public Task updateTask(Task task) {
        return taskRepository.save(task);
    }


    public Task updateTaskById(int id, Task taskDetails) {
        Task existTask = taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User is not found: " + id));

        existTask.setTitle(taskDetails.getTitle());
        existTask.setDescription(taskDetails.getDescription());
        existTask.setStatus(taskDetails.getStatus());
        existTask.setProName(taskDetails.getProName());
        existTask.setAssignee(taskDetails.getAssignee());
        existTask.setDue_date(taskDetails.getDue_date());


        return taskRepository.save(existTask);
    }

    public Task deleteTaskById(int id) {
        Optional<Task> user = taskRepository.findById(id);
        if (user.isPresent()) {
            taskRepository.deleteById(id);
            return user.get();
        }
        return null;
    }

    public List<Task> findTasksBytitle(String title) {

        return taskRepository.findTaskByTitle(title);

    }
}
