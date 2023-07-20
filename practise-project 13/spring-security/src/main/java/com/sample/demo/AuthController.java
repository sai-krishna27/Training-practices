package com.sample.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AuthController {
	
	@ResponseBody
	@RequestMapping("/useraccess")
	public String UserAccess() {
		return "user is authorized";
		
	}
	
	@ResponseBody
	@RequestMapping("/adminaccess")
	public String adminAccess() {
		return "Admin is authorized";
		
	}
}
