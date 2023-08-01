package com.scroll;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTest {
	public static void main(String[] args) throws InterruptedException {
		//register the chrome driver
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\95\\chromedriver.exe");
		//create an obj to the driver -obj to the browser
		WebDriver wd=new ChromeDriver();//wd is the controller obj to web browser
		//maxmize the screen
		wd.manage().window().maximize();
		//web url 
		wd.get("https://www.amazon.in/");
		JavascriptExecutor js=(JavascriptExecutor)wd;
		
	//no of pixels
	//js.executeScript("window.scrollBy(0,1000)");
		
		
//till find element     
//		WebElement we=wd.findElement(By.linkText("Help"));
//		js.executeScript("arguments[0].scrollIntoView();",we);
//		we.click();
		
	//scroll down to the last
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

}
