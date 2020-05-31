package com.boot.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.db.pojo.UserInfo;
@Repository
public class UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public void addUser(UserInfo user) {
		jdbcTemplate.update("insert into user(name,text) values(?,?)",new Object[] {user.getName(),user.getText()});
	}

}
