package com.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
	@RequestMapping("/index")
	@ResponseBody
	public String index(Model model) {
		model.addAttribute("name","hdl123");
		return "index";
	}
	
}
