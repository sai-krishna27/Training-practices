package com.practise;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.Screen;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;


public class Registration {
	public static void main(String[] args) throws InterruptedException, IOException, FindFailed {
		//register the Chrome driver
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\95\\chromedriver.exe");
		//create an obj to the driver -obj to the browser
		WebDriver wd=new ChromeDriver();//wd is the controller obj to web browser
		//maximize the screen
		wd.manage().window().maximize();
		//web url 
		wd.get("http://127.0.0.1:5500/registration.html");
		wd.findElement(By.name("id")).sendKeys("1");
		Thread.sleep(5000);
		wd.findElement(By.name("name")).sendKeys("sai krishna");
		Thread.sleep(5000);
		wd.findElement(By.name("email")).sendKeys("sai@k.in");
		Thread.sleep(5000);
		wd.findElement(By.name("pass")).sendKeys("sai12345");
		Thread.sleep(5000);
		wd.findElement(By.id("male")).click();
		Thread.sleep(5000);
		wd.findElement(By.id("sp1")).click();
		Thread.sleep(5000);
		wd.findElement(By.id("sp2")).click();
		Thread.sleep(5000);
		wd.findElement(By.name("date")).sendKeys("23-06-2022");
		Thread.sleep(5000);
		Select sc=new Select(wd.findElement(By.name("subs")));
		sc.selectByVisibleText("Python");
		Thread.sleep(5000);
		wd.findElement(By.name("address")).sendKeys("ABC block,XYZ street,PQR country");
		Thread.sleep(5000);
		
		Screen s=new Screen();
		Pattern p=new Pattern("F:\\choose.png");
		s.click(p);
		Runtime.getRuntime().exec("F:\\Autoit\\filleupload.exe");
		Thread.sleep(10000);
		wd.findElement(By.xpath("/html/body/form/table/tbody/tr[11]/td/input")).click();
		
		
		
//		Pattern p1=new Pattern("F:\\search.png");
//		s.type(p1,"F:\\sai\\Passport.pdf");
//		Pattern p2=new Pattern("F:\\open.png");
//		s.click(p2);
//		wd.findElement(By.name("register")).click();
		
//Autoit
//		wd.findElement(By.name("file")).click();
//		Runtime.getRuntime().exec("F:\\Autoit\\filleupload.exe");
		
//		using sikuli
		
		
		
		
			
	
	}
}
