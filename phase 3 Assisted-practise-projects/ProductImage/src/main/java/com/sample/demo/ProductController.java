package com.sample.demo;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ProductController {
	
	@Autowired
	public ProductDao dao;
	private final String FOLDER_PATH="E:\\images\\";
	
	@RequestMapping("")
	public ModelAndView home(HttpServletRequest request,HttpServletResponse response) throws ParseException {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index.jsp");
		return mv;
	}
//	@RequestMapping("addImage")
//	public void upload(@RequestParam("image") MultipartFile file) throws IOException {
//		service.uploadImage(file);
//	}
//	
	
	@RequestMapping("addProduct")
	public ModelAndView addProduct(HttpServletRequest request,HttpServletResponse response,@RequestParam("image") MultipartFile file ) throws ParseException {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index.jsp");
		Product product=new Product();
		product.setName(request.getParameter("name"));
		product.setType(request.getParameter("type"));
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date=sdf.parse(request.getParameter("date"));
		product.setManufacturing_date(date);
		
		//image declaration
		product.setImg_name(file.getOriginalFilename());
		product.setImg_type(file.getContentType());
		product.setImg_path(FOLDER_PATH+file.getOriginalFilename());
		
		
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

}
