package DataProviderDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
	
	 WebDriver wd=null;
	 
	
	 @Test(dataProvider = "dp")
	 public void test1(String[] url) {
		  wd.get(url[0]);
		  wd.findElement(By.name("field-keywords")).sendKeys(url[1]);
		  wd.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).submit();
		  Reporter.log("went to test1 and used url "+url[1]);
	 }
	
	 
	 @BeforeTest
	 public void beforeTest() {
		  System.out.println("in beforetest");
		  WebDriverManager.chromedriver().setup();	 
		  wd=new ChromeDriver();
		  wd.manage().window().maximize();
		  Reporter.log("the browser is open");
	 }	
	
	 @AfterTest
	 public void afterTest() {
		  System.out.println("in aftertest");
		  wd.close();
	 }
	 
	 @DataProvider
	 public Object[][] dp(){
		 	 return new Object[][] {
	//test1
	
		  new Object[] {"https://www.amazon.in/","samsung"},
	//test2
		  new Object[] {"https://www.amazon.in/","apple"}
		 };
	 }


}

