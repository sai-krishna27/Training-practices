package com.specificUser;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.table.User;
import com.table.UserDao;

@Controller
public class UserController {


	@RequestMapping("/getUser") //map the name of action in form using dispatcher servlet
	public ModelAndView getUser(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		int id=Integer.parseInt(request.getParameter("id"));
		ApplicationContext ac=new ClassPathXmlApplicationContext("hibernate.xml");
        User user=ac.getBean(User.class);
		UserDao dao=ac.getBean(UserDao.class);
		List<User> u=dao.getUser(id);
		if(u.size()==1) {
			ModelAndView mv=new ModelAndView();
			mv.setViewName("details.jsp");
			mv.addObject("user",u);
			return mv;
		}
		else{
			PrintWriter out=response.getWriter();
			out.print("<h3 style='color:red' align='center'>User id not found</h3>");
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			rd.include(request, response);
		}
		return new ModelAndView();
		
	}
	
	@ResponseBody
	@RequestMapping("/updateUser") //map the name of action in form using dispatcher servlet
	public void updateUser(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		int id=Integer.parseInt(request.getParameter("id"));
		ApplicationContext ac=new ClassPathXmlApplicationContext("hibernate.xml");
        User user=ac.getBean(User.class);
		UserDao dao=ac.getBean(UserDao.class);
		user.setId(Integer.parseInt(request.getParameter("id")));
		user.setName(request.getParameter("name"));
		user.setAge(Integer.parseInt(request.getParameter("age")));
		user.setGender(request.getParameter("gender"));
		dao.update(user);
		
		PrintWriter out=response.getWriter();
		out.print("<h3 style='color:green' align='center'>User details updated successfully</h3>");
		RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		rd.include(request, response);
		
		
	}
	@RequestMapping("/addUser") //map the name of action in form using dispatcher servlet
	public void insertUser(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		int id=Integer.parseInt(request.getParameter("id"));
		ApplicationContext ac=new ClassPathXmlApplicationContext("hibernate.xml");
        User user=ac.getBean(User.class);
        user.setId(Integer.parseInt(request.getParameter("id")));
        user.setAge(Integer.parseInt(request.getParameter("age")));
        user.setGender(request.getParameter("gender"));
        user.setName(request.getParameter("name"));
		UserDao dao=ac.getBean(UserDao.class);
		dao.insert(user);
		
	}
	
	
}
