package com.iioo.framework.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iioo.framework.dao.UserInfoMapper;
import com.iioo.framework.model.User;
import com.iioo.framework.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserInfoMapper userInfoMapper;

	@Override
	public User getUserById(int id) {
		return userInfoMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<User> getUsers() {
		return userInfoMapper.selectAll();
	}

	@Override
	public int insert(User userInfo) {
		
		int result = userInfoMapper.insert(userInfo);
		
		System.out.println(result);
		return result;
	}
}
