package com.boot.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boot.pojo.User;
import com.boot.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/save")
	@ResponseBody
	public String save() {
		User user=new User();
		user.setName("hdl");
		user.setDate(new Date());
		userService.saveUser(user);
		return "success";
	}
	
	@RequestMapping("/find/{id}")
	@ResponseBody
	public User find(@PathVariable Integer id) {
		return userService.findOne(id);
	}
	
	@RequestMapping("/delete/{id}")
	@ResponseBody
	public String delete(@PathVariable Integer id) {
		userService.delete(id);
		return "success";
	}

}
