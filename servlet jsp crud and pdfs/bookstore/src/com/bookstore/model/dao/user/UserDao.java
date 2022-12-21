package com.bookstore.model.dao.user;
import java.util.*;
public interface UserDao {
	public void addUser(User user);
	public User getUser(String username, String password);
}
