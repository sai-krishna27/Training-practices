package com.alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//handling alert messages
public class AlertTest {
	public static void main(String[] args) throws InterruptedException {
		//register the chrome driver
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\95\\chromedriver.exe");
		//create an obj to the driver -obj to the browser
		WebDriver wd=new ChromeDriver();//wd is the controller obj to web browser
		//maxmize the screen
		wd.manage().window().maximize();
		//web url 
		wd.manage().timeouts().pageLoadTimeout(2000,TimeUnit.MILLISECONDS);
		wd.get("http://127.0.0.1:5500/msg.html");
		Alert alert=wd.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(3000);
		
		//clicks on ok
		alert.accept();
		
	
		
		
	}
}
