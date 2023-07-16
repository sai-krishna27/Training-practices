package com.table;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class UserDao {
private HibernateTemplate temp;

public void setTemp(HibernateTemplate temp) {
	this.temp = temp;
}


//insert,update,delete
	public int insert(User u) {
		return (Integer) temp.save(u);	
	}
	
	//list of users with id
	public List<User> getUser(int id) {
		
		
		return  (List<User>) temp.find("from User where id="+id);
		
	}


	public void update(User user) {
		temp.update(user);
		
	}
	
}