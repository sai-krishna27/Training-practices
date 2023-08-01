package com.implicit.timing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ImplicitTest {
public static void main(String[] args) throws InterruptedException {
	//register the chrome driver
	System.setProperty("webdriver.chrome.driver","F:\\selenium\\95\\chromedriver.exe");
	//create an obj to the driver -obj to the browser
	WebDriver wd=new ChromeDriver();//wd is the controller obj to web browser
	//maxmize the screen
	wd.manage().window().maximize();
	//web url 
	wd.manage().timeouts().pageLoadTimeout(20000,TimeUnit.MILLISECONDS);
	wd.get("https://www.amazon.in/");
	wd.manage().timeouts().implicitlyWait(20000,TimeUnit.MILLISECONDS);
	wd.findElement(By.linkText("Sign in")).click();
	wd.findElement(By.id("ap_email")).sendKeys("chebrolusaikrishna27@gmail.com");
	wd.findElement(By.id("continue")).click();
	wd.manage().timeouts().implicitlyWait(20000,TimeUnit.MILLISECONDS);
	wd.findElement(By.id("ap_password")).sendKeys("Sai123456#");
	wd.findElement(By.id("signInSubmit")).click();
	wd.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
	wd.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung mobile");

	wd.findElement(By.id("nav-search-submit-button")).click();
	wd.close();
	
	}
}
