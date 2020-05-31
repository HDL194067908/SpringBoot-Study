package com.boot.service;

import com.db.pojo.UserInfo;

public interface UserService {
	
	UserInfo findUserByName(String name);
	
	void addUser(UserInfo user);

}
