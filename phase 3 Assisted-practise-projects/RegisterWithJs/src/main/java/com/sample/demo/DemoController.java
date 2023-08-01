package com.sample.demo;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class DemoController {
	
	
	@Autowired
	Repo dao;
	
	@RequestMapping("registerAdmin")
	public int registerAdmin(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		Register admin=new Register();
		admin.setName(request.getParameter("name"));
		admin.setEmail(request.getParameter("email"));
		admin.setPassword(request.getParameter("password")); 
		if(dao.getAdmin(request.getParameter("email"))==0) {
			dao.save(admin);
			return 1;
		}
		else{
			return 0;
		}
	}
}

