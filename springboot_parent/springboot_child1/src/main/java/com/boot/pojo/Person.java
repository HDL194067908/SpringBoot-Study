package com.boot.pojo;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class Person {

	private int id;
	@JSONField(format = "yyyy-MM-dd HH:mm")
	private Date date;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
