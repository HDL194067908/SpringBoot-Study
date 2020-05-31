package com.boot.app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



//开启自动配置
//(exclude = {})排除自动配置
//@EnableAutoConfiguration
//开启扫描
//@ComponentScan("com.boot.controller")
@SpringBootApplication(scanBasePackages = {"com.boot","com.boot.email"})
public class ApplicationBoot //extends WebMvcConfigurerAdapter{
{
	//程序入口
	public static void main(String[] args) {
		SpringApplication.run(ApplicationBoot.class, args);

	}



}
