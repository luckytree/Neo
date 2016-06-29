package com.iioo.test.framework.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.iioo.framework.model.User;
import com.iioo.framework.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
		"classpath:spring-mybatis.xml" })
public class TestUserService {

	private static final Logger LOGGER = Logger
			.getLogger(TestUserService.class);

	@Autowired
	private UserService userService;

	
	@Test
	public void testQueryById1() {
		User userInfo = userService.getUserById(1);
		LOGGER.info(JSON.toJSON(userInfo));
	}

	@Test
	public void testQueryAll() {
		List<User> userInfos = userService.getUsers();
		LOGGER.info(JSON.toJSON(userInfos));
	}

	@Test
	public void testInsert() {
		User userInfo = new User();
		userInfo.setUname("xiaoming");
		userInfo.setUnumber(4);
		int result = userService.insert(userInfo);
		System.out.println(result);
	}
}