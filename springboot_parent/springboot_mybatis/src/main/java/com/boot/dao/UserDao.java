package com.boot.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.db.pojo.UserInfo;

public interface UserDao {
	
	@Select("select * from user where name=#{name}")
	UserInfo findUserByName(@Param("name") String name);
	
	@Insert("insert into user(name,text) values(#{name},#{text})")
	void addUser(@Param("name")String name,@Param("text")String text);
	

}
