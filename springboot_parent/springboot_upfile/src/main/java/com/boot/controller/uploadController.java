package com.boot.controller;

import java.io.File;
import java.util.UUID;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class uploadController {
	
	@RequestMapping("/index")
	public String toupload() {
		return "index";
	}
	

	@RequestMapping(method = RequestMethod.POST,value = "/upload")
	@ResponseBody
	public String uploadfile(MultipartFile file,HttpServletRequest request) {
		try {
			//创建文件在服务端的存放路径
			String dir=request.getServletContext().getRealPath("/upload");
			File fileDir=new File(dir);
			if(!fileDir.exists())
				fileDir.mkdir();
			//上传文件在服务端存放的名字
			String fileSuffix=file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
			String fileName=UUID.randomUUID().toString()+fileSuffix;
			//封装文件
			File files=new File(fileDir+"/"+fileName);
			//实现上传
			file.transferTo(files);
			
		} catch (Exception e) {
			e.printStackTrace();
			return "失败";
		}
		return "成功";
	}
}
