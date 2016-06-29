package com.iioo.framework.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iioo.framework.model.User;
import com.iioo.framework.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/showInfo/{userId}")
	public String showUserInfo(ModelMap modelMap, @PathVariable int userId){
		User userInfo = userService.getUserById(userId);
		modelMap.addAttribute("userInfo", userInfo);
		return "/user/showInfo";
	}
	
	@RequestMapping("/showInfos")
	public @ResponseBody Object showUserInfos(){
		List<User> userInfos = userService.getUsers();
		return userInfos;
	}
}