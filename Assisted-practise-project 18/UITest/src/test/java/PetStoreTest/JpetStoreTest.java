package PetStoreTest;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JpetStoreTest {
	WebDriver wd;
	
	@BeforeTest
	public void initialize() {
		WebDriverManager.chromedriver().setup();
		wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://jpetstore.aspectran.com/account/signonForm");
	}
	
	
	
	@Test(priority=1)
	public void loginTest() throws InterruptedException {
		wd.findElement(By.name("username")).clear();
		wd.findElement(By.name("password")).clear();
		Thread.sleep(2000);
		wd.findElement(By.name("username")).sendKeys("j2ee");
		Thread.sleep(2000);
		wd.findElement(By.name("password")).sendKeys("je");
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\"Signon\"]/form/div/div/button")).submit();
		Thread.sleep(2000);
		try {
			wd.findElement(By.linkText("Sign Out"));
			Reporter.log("login successful");
		}
		catch(Exception e) {
			Reporter.log("login unsuccessful");
			fail();
		}
	}
	
	
	@Test(priority=2,dependsOnMethods = "loginTest")
	public void searchTest() throws InterruptedException {
		wd.findElement(By.xpath("//*[@id=\"SearchContent\"]/form/div/input")).sendKeys("fish");
		Thread.sleep(2000);
		wd.findElement(By.cssSelector("#SearchContent > form > div > div > button")).submit();
		Thread.sleep(2000);
		try {
			String data=wd.findElement(By.linkText("FI-SW-01")).getText();
			assertNotNull(data);
			Reporter.log("Search successful");
		}
		catch(Exception e) {
			Reporter.log("Search failed");
			fail();
		}
		wd.findElement(By.linkText("Return to Main Menu")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority=3,dependsOnMethods = "loginTest")
	public void addCartTest() throws InterruptedException {
		wd.findElement(By.linkText("Reptiles")).click();
		Thread.sleep(2000);
		wd.findElement(By.linkText("RP-SN-01")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();
		try {
			String data=wd.findElement(By.linkText("Proceed to Checkout")).getText();
			Thread.sleep(2000);
			assertNotNull(data);
			Reporter.log("successfully added item to cart");
		}
		catch(Exception e) {
			Reporter.log("Failed adding item to cart");
		}
		wd.findElement(By.linkText("Remove All")).click();
		Thread.sleep(2000);
		
	}
	
	@AfterTest
	public void closeDriver() {
		wd.close();
	}

	
}
