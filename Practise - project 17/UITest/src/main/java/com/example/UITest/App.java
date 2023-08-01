package com.example.UITest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	WebDriver wd;
    	 WebDriverManager.chromedriver().setup();	 
		  wd=new ChromeDriver();
		  wd.manage().window().maximize();
		  wd.get("http://127.0.0.1:5500/register.html");
			wd.findElement(By.name("name")).sendKeys("john");
			Thread.sleep(5000);
			wd.findElement(By.name("email")).sendKeys("john@w.in");
			Thread.sleep(5000);
			wd.findElement(By.name("pass")).sendKeys("johnson");
			Thread.sleep(5000);
			wd.findElement(By.id("male")).click();
			Thread.sleep(5000);
			wd.findElement(By.name("date")).sendKeys("13-04-1992");
			Thread.sleep(5000);
			wd.close();
			
			
			WebDriver wd1;
	    	WebDriverManager.chromedriver().setup();	 
			wd1=new ChromeDriver();
			wd1.manage().window().maximize();
			wd1.get("http://127.0.0.1:5500/login.html");
			wd1.findElement(By.name("email")).sendKeys("john@w.in");
			Thread.sleep(5000);
			wd1.findElement(By.name("pass")).sendKeys("johnson");
			Thread.sleep(5000);
			wd1.close();
			
			
		  
    }
}
