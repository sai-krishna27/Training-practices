package com.sample.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRepo repo;
	
	@RequestMapping("login")
	public ModelAndView login(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		if(repo.getUser(request.getParameter("email"), request.getParameter("password"))!=null) {
			mv.setViewName("success.jsp");
			mv.addObject("name",repo.getUser(request.getParameter("email"), request.getParameter("password")));
		}
		else {
			mv.setViewName("fail.jsp");
		}
		return mv;
	}
	
	@RequestMapping("register")
	public String register(HttpServletRequest request,HttpServletResponse response) {
		//Rest API
		RestTemplate rest=new RestTemplate();
		String url="http://localhost:8087/register/"+request.getParameter("name")+"/"+request.getParameter("email")+"/"+request.getParameter("password");
		rest.getForObject(url, String.class);
		return "registration is successfull";
	}
}
