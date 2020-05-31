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
	
	@RequestMapping("/save")
	@ResponseBody
	public String save() {
		UserInfo user=new UserInfo();
		user.setName("hdltest");
		user.setText("test4");
		userService.addUser(user);
		return "sucess";
	}
	
	@RequestMapping("/query")
	@ResponseBody
	public String query() {
		UserInfo user=userService.findUserByName("hdltest");
		
		return user.getName()+"--"+user.getText();
	}
}
