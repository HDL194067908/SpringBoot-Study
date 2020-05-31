package com.boot.controller;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boot.mailService.EmailService;

@Controller
public class emailController {

	@Autowired
	private EmailService emailService;
	
	@RequestMapping("/send")
	@ResponseBody
	public String send() {
		emailService.simplemail("916871894@qq.com", "代码发送邮件", "基于SpringBoot整合Email给你发送了一封邮件");
		return "发送成功";
	}
	
	@RequestMapping("/sendfile")
	@ResponseBody
	public String filemail() {
		File file=new File("src/main/resources/static/myshell");
		emailService.filemail("194067908@qq.com", "代码发送邮件", "基于SpringBoot整合Email给你发送了一封带附件的邮件",file);
		return "发送成功";
	}
}
