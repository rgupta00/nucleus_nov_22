package com.customerapp.dao.user;
import java.util.*;
public interface UserDao {
    public void addUser(User user);
    public User validateUser(String username, String password, String profile);

}
