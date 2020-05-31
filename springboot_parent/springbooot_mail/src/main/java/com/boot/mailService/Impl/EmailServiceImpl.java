package com.boot.mailService.Impl;

import java.io.File;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.boot.mail.EmailSelf;
import com.boot.mailService.EmailService;
@Service
public class EmailServiceImpl implements EmailService {
	//发送者
	@Autowired
	private EmailSelf self;
	
	//怎么发
	@Autowired
	private JavaMailSender emailSecder;

	@Override
	public void simplemail(String sendTo, String title, String context) {
		SimpleMailMessage msg=new SimpleMailMessage();
		msg.setFrom(self.getSelf());
		msg.setTo(sendTo);
		msg.setSubject(title);
		msg.setText(context);
		emailSecder.send(msg);
	}

	//带附件的邮箱
	@Override
	public void filemail(String sendTo, String title, String context, File file) {
		MimeMessage msg=emailSecder.createMimeMessage();
		try {
			MimeMessageHelper helper=new MimeMessageHelper(msg,true);
			helper.setFrom(self.getSelf());
			helper.setTo(sendTo);
			helper.setSubject(title);
			helper.setText(context);
			FileSystemResource r=new FileSystemResource(file);
			helper.addAttachment("附件", r);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		emailSecder.send(msg);
	}
}
