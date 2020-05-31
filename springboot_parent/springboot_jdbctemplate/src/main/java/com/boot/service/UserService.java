package com.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.dao.UserDao;
import com.db.pojo.UserInfo;
@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	public void saveUser(UserInfo user) {
		userDao.addUser(user);
	}

}
