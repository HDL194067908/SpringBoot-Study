package com.boot.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.dao.UserDao;
import com.boot.service.UserService;
import com.db.pojo.UserInfo;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao; 

	@Override
	public UserInfo findUserByName(String name) {
		
		return userDao.findUserByName(name);
	}

	@Override
	public void addUser(UserInfo user) {
		userDao.addUser(user.getName(),user.getText());

	}

}
