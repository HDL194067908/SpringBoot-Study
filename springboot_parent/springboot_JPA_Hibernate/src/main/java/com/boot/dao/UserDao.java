package com.boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.pojo.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
