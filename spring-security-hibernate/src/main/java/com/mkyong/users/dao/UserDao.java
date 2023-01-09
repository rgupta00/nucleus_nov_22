package com.mkyong.users.dao;

import com.mkyong.users.model.User;

public interface UserDao {

	User findByUserName(String username);

}