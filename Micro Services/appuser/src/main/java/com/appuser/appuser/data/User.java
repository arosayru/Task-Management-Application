package com.appuser.appuser.data;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "User_Id")
    private int userId;
    @Column(name = "User_Name")
    private String userName;
    @Column(name = "User_Telephone")
    private int userTel;
    @Column(name = "User_Password")
    private String userPassword;
    @Column(name = "User_Email")
    private String userEmail;
    @Column(name = "User_Role")
    private String userRole;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserTel() {
        return userTel;
    }

    public void setUserTel(int userTel) {
        this.userTel = userTel;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }
}
