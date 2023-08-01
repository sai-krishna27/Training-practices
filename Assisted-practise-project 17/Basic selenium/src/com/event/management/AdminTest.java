package com.event.management;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminTest {

WebDriver wd;
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\95\\chromedriver.exe");
		//create an obj to the driver -obj to the browser
		wd=new ChromeDriver();//wd is the controller obj to web browser
		//maxmize the screen
		wd.manage().window().maximize();
		//web url 
		wd.get("http://eventmanagementangular.s3-website-us-east-1.amazonaws.com");
	}
	
	
	@Test
	public void test1() throws InterruptedException {
		wd.findElement(By.name("uname")).sendKeys("admin");
		wd.findElement(By.name("upass")).sendKeys("admin123");
		wd.findElement(By.name("login")).click();
		String actualres=wd.findElement(By.name("message")).getText();
		String expres="Incorrect login details";
		assertEquals(expres, actualres);
		Thread.sleep(20000);
		wd.close();
		
		
	}
	
	@Test
	public void test2() throws InterruptedException {
		wd.findElement(By.name("uname")).sendKeys("admin");
		wd.findElement(By.name("upass")).sendKeys("admin");
		wd.findElement(By.name("login")).click();
		String actualres=wd.findElement(By.name("message")).getText();
		String expres="Incorrect login details";
		assertNotEquals(expres, actualres);
		wd.findElement(By.name("logout")).click();
		Thread.sleep(20000);
		wd.close();
		
	}
	@Test
	public void test3() throws InterruptedException {

		wd.findElement(By.name("forget_pass")).click();
		wd.findElement(By.name("np")).sendKeys("admin");
		wd.findElement(By.name("cp")).sendKeys("admin");
		wd.findElement(By.name("reset_pass")).click();
		String actualres=wd.findElement(By.name("success_reset")).getText();
		String expres="Reset Successful";
		assertEquals(expres, actualres);
		Thread.sleep(20000);
		wd.close();
		
	}
	@Test
	public void test4() throws InterruptedException {

		wd.findElement(By.name("forget_pass")).click();
		wd.findElement(By.name("np")).sendKeys("admin");
		wd.findElement(By.name("cp")).sendKeys("admin123456");
		wd.findElement(By.name("reset_pass")).click();
		String actualres=wd.findElement(By.name("failed_reset")).getText();
		String expres="Password mismatch";
		assertEquals(expres, actualres);
		Thread.sleep(20000);
		wd.close();
		
	}

	
	
	
	@After
	public void deref() {
		wd=null;
	}

}
