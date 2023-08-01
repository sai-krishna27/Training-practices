package Tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calculator {
	
	WebDriver wd=null;
	
	@BeforeTest
	public void initialize() {
		WebDriverManager.chromedriver().setup();
		wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/search?q=calculator&oq=&aqs=chrome.0.35i39i362l8.357130j0j7&sourceid=chrome&ie=UTF-8");
		
	}
	
	@Test(priority=-1)
	public void addition() throws InterruptedException {
		wd.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[2]/td[3]/div/div")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[3]/td[3]/div/div")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[4]/div/div")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[4]/td[2]/div/div")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[4]/td[3]/div/div")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[3]/div/div")).click();
		Thread.sleep(2000);
		String ao=wd.findElement(By.id("cwos")).getText();
		assertEquals("119",ao);
		
		//generates a report for this test scenario
		Reporter.log("perform addition operation in a online calculator");
	}

	
	@Test(priority=0)
	public void multiplication() throws InterruptedException {
		wd.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[2]/td[2]/div/div")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[4]/td[1]/div/div")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[3]/td[4]/div/div")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[4]/td[2]/div/div")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[3]/div/div")).click();
		Thread.sleep(2000);
		String ao=wd.findElement(By.id("cwos")).getText();
		assertEquals("162",ao);
	}
	
	@Test(priority=1)
	public void pivalue() throws InterruptedException {
		wd.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/div/div[3]/div/table[1]/tbody/tr[3]/td[1]/div/div")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[3]/div/div")).click();
		Thread.sleep(2000);
		String ao=wd.findElement(By.id("cwos")).getText();
		assertEquals("3.14",ao.substring(0,4));
	}
	
	@Test(priority=2)
	public void squareRoot() throws InterruptedException {
		wd.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/div/div[3]/div/table[1]/tbody/tr[4]/td[3]/div/div[1]")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[4]/td[2]/div/div")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[3]/td[2]/div/div")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[3]/div/div")).click();
		Thread.sleep(2000);
		String ao=wd.findElement(By.id("cwos")).getText();
		assertEquals("5",ao);
	}
	
	
	@Test(priority=3)
	public void factorial() throws InterruptedException {
		wd.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[2]/td[1]/div/div")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/div/div[3]/div/table[1]/tbody/tr[1]/td[2]/div/div")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[3]/div/div")).click();
		Thread.sleep(2000);
		String ao=wd.findElement(By.id("cwos")).getText();
		assertEquals("5040",ao.substring(0,4));
	}
	
	
	
	@AfterTest
	public void close() {
		wd.close();
	}
	
  
}
