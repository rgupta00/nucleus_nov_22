package com.productapp.model.dao;

import com.productapp.model.dao.entities.UserEntity;
import org.springframework.security.core.userdetails.User;

import java.util.List;

public interface UserDao {
    public List<UserEntity> getAllUsers();
    public void addUser(UserEntity user);
    public UserEntity getUserByEmail(String email);

}
