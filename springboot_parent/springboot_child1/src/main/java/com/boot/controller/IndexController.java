package com.boot.controller;

import java.nio.charset.Charset;
import java.util.Date;
import java.util.concurrent.Future;

import javax.websocket.server.PathParam;

import org.assertj.core.data.Percentage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.pojo.Person;
import com.boot.service.AsyncService;

@Controller
public class IndexController {
	//springoot默认配置
//	@Bean
//	public StringHttpMessageConverter stringHttpMessageConverter() {
//		return new StringHttpMessageConverter(Charset.forName("UTF-8"));
//	}
	@Autowired
	private AsyncService asyncservice;
	
	@RequestMapping("/object")
	@ResponseBody
	public Object showInfo() {
		Person person=new Person();
		person.setId(123);
		person.setName("黄东林");
		person.setDate(new Date());
		return person;
	}
	
	@RequestMapping("/")
	@ResponseBody
	public String index() {
		//int i=5/0;
		return "hello,黄东林";
	}
    
	//Rest风格
	@RequestMapping("/yes/{msg}")
	@ResponseBody
	public String yes(@PathVariable String msg) {
		return "show:"+msg;
	}

	@RequestMapping("/async")
	@ResponseBody
	public String async() throws Exception {
		long start=System.currentTimeMillis();
		Future<String> task1=asyncservice.doTask1();
		Future<String> task2=asyncservice.doTask2();
		Future<String> task3=asyncservice.doTask3();
		while(true) {
			if(task1.isDone() && task2.isDone() && task3.isDone()) {
				break;
			}
			Thread.sleep(1000);
		}
		long end = System.currentTimeMillis();
		return "耗时+["+(end-start)+"]";
	}
}
