package Tests;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MphasisTest {
WebDriver wd=null;
	
	@BeforeTest
	public void initialize() {
		WebDriverManager.chromedriver().setup();
		wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.mphasis.com/home.html");
		
	}
	
	@Test
	public void contactTest() throws InterruptedException {
		wd.findElement(By.linkText("Contact")).click();
		Thread.sleep(2000);
		wd.findElement(By.id("atab_slide_1")).click();
		Thread.sleep(2000);
		String ao=wd.findElement(By.xpath("//*[@id=\"tab_slide_1\"]/div/div/div/div/div[2]/div[1]/div/h5[2]/span")).getText();
		assertEquals(ao,"Hyderabad");
	}
	
	@Test
	public void StockExchangeTest() throws InterruptedException {
		wd.findElement(By.linkText("Investors")).click();
		Thread.sleep(2000);
		String ao=wd.findElement(By.xpath("//*[@id=\"bse-result\"]/div[2]/div[2]")).getText();
		assertTrue(Integer.parseInt(currency(ao))>2000);
	}

	
	
	
	
	private String currency(String ao) {
		String temp="";
		for(int i=0;i<ao.length();i++) {
			if(ao.charAt(i)=='.') {
				return temp;
			}
			else if(ao.charAt(i)!=',') {
				temp+=ao.charAt(i);
			}
			else {
				continue;
			}
		}
		return null;
	}

	@AfterTest
	public void close() {
		wd.close();
	}
  
}
