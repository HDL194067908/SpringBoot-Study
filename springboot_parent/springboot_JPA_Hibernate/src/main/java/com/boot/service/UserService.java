package com.boot.service;

import com.boot.pojo.User;

public interface UserService {
	void saveUser(User user);
	User findOne(Integer id);
	void delete(Integer id);


}
