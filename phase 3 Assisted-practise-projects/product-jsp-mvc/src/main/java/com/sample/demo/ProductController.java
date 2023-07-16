package com.sample.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ProductController {
	
	@Autowired
	public ProductDao dao;
	
	@RequestMapping("")
	public ModelAndView home(HttpServletRequest request,HttpServletResponse response) throws ParseException {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index.jsp");
		return mv;
	}
	
	@RequestMapping("addProduct")
	public ModelAndView addProduct(HttpServletRequest request,HttpServletResponse response) throws ParseException {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index.jsp");
		Product product=new Product();
		product.setName(request.getParameter("name"));
		product.setType(request.getParameter("type"));
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date=sdf.parse(request.getParameter("date"));
		product.setManufacturing_date(date);
		dao.insert(product);
		return mv;
	}
	
	@RequestMapping("getProducts")
	public ModelAndView getProducts(HttpServletRequest request,HttpServletResponse response) throws ParseException {
		ModelAndView mv=new ModelAndView();
		List<Product> list=dao.getAll();
		mv.setViewName("details.jsp");
		mv.addObject("products",list);
		return mv;
	}
	
	@RequestMapping("editProduct")
	public ModelAndView editProduct(HttpServletRequest request,HttpServletResponse response) throws ParseException {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index.jsp");
		Product product=new Product();
		product.setId(Integer.parseInt(request.getParameter("id")));
		product.setName(request.getParameter("name"));
		product.setType(request.getParameter("type"));
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date=sdf.parse(request.getParameter("date"));
		product.setManufacturing_date(date);
		dao.updateProduct(product);
		return mv;
	}
	
	@RequestMapping("deleteProduct")
	public ModelAndView deleteProduct(HttpServletRequest request,HttpServletResponse response) throws ParseException {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index.jsp");
		dao.deleteProduct(Integer.parseInt(request.getParameter("id")));
		return mv;
	}
}
