package VaccinationCenter;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdminTest {
WebDriver wd;
	
	@BeforeTest
	public void initialize() {
		WebDriverManager.chromedriver().setup();
		wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("http://localhost:8086/");
		
	}
	
	
	@Test(priority=1)
	public void signInTest() throws InterruptedException {
		wd.findElement(By.name("email")).sendKeys("sai@k.in");
		Thread.sleep(3000);
		wd.findElement(By.name("password")).sendKeys("sai@3");
		Thread.sleep(3000);
		wd.findElement(By.xpath("/html/body/div/form[1]/input[3]")).submit();
		String ao=wd.findElement(By.xpath("/html/body/table/tbody/tr/td[4]")).getText();
		Thread.sleep(3000);
		assertEquals(ao,"Welcome adm !");
		Reporter.log("Sign in successful");
	}
	
	@Test(priority=1,dependsOnMethods = "signInTest")
	public void getCitizensList() throws InterruptedException {
		wd.findElement(By.linkText("Citizens")).click();
		Thread.sleep(3000);
		String ao=wd.findElement(By.xpath("/html/body/h1")).getText();
		Thread.sleep(3000);
		assertEquals(ao,"Citizens");
		Reporter.log("citizens List displayed");
	}
	
	@Test(priority=1,dependsOnMethods = "signInTest")
	public void getCentersList() {
		wd.findElement(By.linkText("Vaccination Centers")).click();
		String ao=wd.findElement(By.xpath("/html/body/h1")).getText();
		assertEquals(ao,"Centers");
		Reporter.log("centers List displayed");
	}
	
	@AfterTest
	public void close() {
		wd.close();
	}
}
