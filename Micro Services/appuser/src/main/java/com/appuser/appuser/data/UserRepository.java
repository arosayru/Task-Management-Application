package com.appuser.appuser.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("select u from User u where u.userName=?1")
    List<User> findUserByName(String userName);

    @Query("select u from User u where u.userName=?1 and u.userPassword=?2")
    User findUserByUsernameAndPassword(String userName, String userPassword);
}
