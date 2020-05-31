package com.boot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//开启自动配置
//(exclude = {})排除自动配置
@EnableAutoConfiguration
@Controller

//读取properties文件
@ConfigurationProperties(prefix = "test")
public class IndexController {
	
	//@Value("${test.str1}")
	private String str1;
	
	//@Value("${test.str2}")
	private String str2;
	
	public String getStr1() {
		return str1;
	}

	public void setStr1(String str1) {
		this.str1 = str1;
	}

	public String getStr2() {
		return str2;
	}

	public void setStr2(String str2) {
		this.str2 = str2;
	}

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return str1+"-"+str2;
	}
    
	//入口 
	public static void main(String[] args) {
		SpringApplication.run(IndexController.class, args);
	}
}
