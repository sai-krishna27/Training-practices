package com.event.management;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTest {

	WebDriver wd;
	@Before
	public void init() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\95\\chromedriver.exe");
		//create an obj to the driver -obj to the browser
		wd=new ChromeDriver();//wd is the controller obj to web browser
		//maxmize the screen
		wd.manage().window().maximize();
		//web url 
		wd.get("http://localhost:4200");
		wd.findElement(By.name("uname")).sendKeys("admin");
		wd.findElement(By.name("upass")).sendKeys("admin");
		wd.findElement(By.name("login")).click();
		Thread.sleep(20000);
	}
	
	
	@Test
	public void test1() throws InterruptedException {
		
		wd.findElement(By.name("search")).sendKeys("1");
		Thread.sleep(2000);
		wd.findElement(By.name("searchById")).click();
		Thread.sleep(2000);
		String actualres=wd.findElement(By.name("emp_name")).getText();
		Thread.sleep(2000);
		assertNotNull(actualres);
		Thread.sleep(2000);
		wd.findElement(By.name("logout")).click();
		Thread.sleep(2000);
		wd.close();
		
	}
	
	@Test
	public void test2() {
		
		wd.findElement(By.name("search")).sendKeys("6");
		wd.findElement(By.name("searchById")).click();
		String actualres=wd.findElement(By.name("emp_name")).getText();
		assertEquals("",actualres);
		wd.findElement(By.name("logout")).click();
		wd.close();
		
	}
	


}
