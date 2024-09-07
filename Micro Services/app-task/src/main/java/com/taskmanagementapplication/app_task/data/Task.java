package com.taskmanagementapplication.app_task.data;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "status")
    private String status;

    @Column(name = "due_date")
    private Date dueDate;

    @Column(name = "assignee")
    private String assignee;

    @Column(name = "proName")
    private String proName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDue_date() {
        return dueDate;
    }

    public void setDue_date(Date due_date) {
        this.dueDate = due_date;
    }

    public String getAssignee() {return assignee;}

    public void setAssignee(String assignee) {this.assignee = assignee;}

    public String getProName() {return proName;}

    public void setProName(String proName) {this.proName = proName;}
}
