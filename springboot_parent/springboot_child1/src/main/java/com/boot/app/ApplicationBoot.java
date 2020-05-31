package com.boot.app;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;


//开启自动配置
//(exclude = {})排除自动配置
//@EnableAutoConfiguration
//开启扫描
//@ComponentScan("com.boot.controller")
@SpringBootApplication(scanBasePackages = {"com.boot.controller","com.boot.handler","com.boot.service"})
//开启异步执行
@EnableAsync
public class ApplicationBoot //extends WebMvcConfigurerAdapter{
{
	//程序入口
	public static void main(String[] args) {
		SpringApplication.run(ApplicationBoot.class, args);

	}

//	@Override
//	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//
//		//创建FastJson的消息转换器
//		FastJsonHttpMessageConverter convert=new FastJsonHttpMessageConverter();
//		//创建FastJson配置对象
//		FastJsonConfig config=new FastJsonConfig();
//		//对Json数据格式化
//		config.setSerializerFeatures(SerializerFeature.PrettyFormat);
//		
//		convert.setFastJsonConfig(config);
//		converters.add(convert);
//				
//	}
	@Bean
	public HttpMessageConverters fastjsonMessageConcerter(){
		//创建FastJson的消息转换器
		FastJsonHttpMessageConverter convert=new FastJsonHttpMessageConverter();
		//创建FastJson配置对象
		FastJsonConfig config=new FastJsonConfig();
		//对Json数据格式化
		config.setSerializerFeatures(SerializerFeature.PrettyFormat);
		
		convert.setFastJsonConfig(config);
		HttpMessageConverter<?> con=convert;
		return new HttpMessageConverters(con);
	}
	

}
