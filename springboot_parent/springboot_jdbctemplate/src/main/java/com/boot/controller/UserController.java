package com.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boot.service.UserService;
import com.db.pojo.UserInfo;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/saveuser")
	@ResponseBody
	public String save() {
		UserInfo user=new UserInfo();
		user.setName("hdl");
		user.setText("test1");
		userService.saveUser(user);
		return "sucess";
	}
}
