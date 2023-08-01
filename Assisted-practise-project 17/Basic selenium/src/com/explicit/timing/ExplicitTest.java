package com.explicit.timing;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitTest {
	public static void main(String[] args) throws InterruptedException {
		//register the chrome driver
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\95\\chromedriver.exe");
		//create an obj to the driver -obj to the browser
		WebDriver wd=new ChromeDriver();//wd is the controller obj to web browser
		//maxmize the screen
		wd.manage().window().maximize();
		//web url 
		wd.manage().timeouts().pageLoadTimeout(2000,TimeUnit.MILLISECONDS);
		wd.get("http://127.0.0.1:5500/explicit.html");
		//wd.manage().timeouts().implicitlyWait(10,TimeUnit.NANOSECONDS);
		WebElement we1=wd.findElement(By.name("name"));
		WebElement we2=wd.findElement(By.name("books"));
		explicit(wd,we1,200,"sai");//200ms is the max time to load the value in the forms
		explicitSelect(wd,we2,100);
	}


	public static void explicit(WebDriver wd,WebElement we,int timeout,String value) {
		new WebDriverWait(wd, timeout).until(ExpectedConditions.visibilityOf(we));
		we.sendKeys(value);
	}
	
	public static void explicitSelect(WebDriver wd, WebElement we, int timeout) {
		new WebDriverWait(wd, timeout).until(ExpectedConditions.visibilityOf(we));
		Select sc=new Select(we);
		sc.selectByVisibleText("python");
	}
}
