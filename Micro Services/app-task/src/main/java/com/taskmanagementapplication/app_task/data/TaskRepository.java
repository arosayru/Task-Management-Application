package com.taskmanagementapplication.app_task.data;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task , Integer> {
    List<Task> findTaskByTitle(String title);
}
