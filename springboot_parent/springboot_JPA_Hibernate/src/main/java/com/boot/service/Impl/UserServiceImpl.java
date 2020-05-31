package com.boot.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.dao.UserDao;
import com.boot.pojo.User;
import com.boot.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	public void saveUser(User user) {
		userDao.save(user);
	}

	@Override
	public User findOne(Integer id) {
		return userDao.findOne(id);
	}

	@Override
	public void delete(Integer id) {
		userDao.delete(id);
		
	}



}
