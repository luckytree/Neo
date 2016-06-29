package com.iioo.framework.service;

import java.util.List;

import com.iioo.framework.model.User;

public interface UserService {

	User getUserById(int id);
	
	List<User> getUsers();
	
	int insert(User userInfo);
}
