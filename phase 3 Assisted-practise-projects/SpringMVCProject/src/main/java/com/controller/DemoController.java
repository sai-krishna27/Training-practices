package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {

	@RequestMapping("/add")
	//model and view for tranfering data to a jsp(physical page)
	public ModelAndView displayadd(HttpServletRequest request,HttpServletResponse response) {
		int result = Integer.parseInt(request.getParameter("no1"))+Integer.parseInt(request.getParameter("no2"));
		ModelAndView mv=new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("res", result);
		return mv;
	}


	@ResponseBody
	@RequestMapping("/sub")
	public String displaysub(HttpServletRequest request,HttpServletResponse response) {
		int result = Integer.parseInt(request.getParameter("no1"))-Integer.parseInt(request.getParameter("no2"));
		return "sub of the numbers is " + result ;
	}
}
