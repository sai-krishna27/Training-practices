//Basic sele operations :

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumProject  {
	public static void main(String[] args) throws InterruptedException {
		//register the Chrome driver
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\95\\chromedriver.exe");
		//create an obj to the driver -obj to the browser
		WebDriver wd=new ChromeDriver();//wd is the controller obj to web browser
		//maximize the screen
		wd.manage().window().maximize();
		//web url 
			wd.get("https://www.amazon.in/");
	//		wd.findElement(By.linkText("Start here.")).click();
	//		wd.findElement(By.id("ap_customer_name")).sendKeys("karthik");
	//		wd.findElement(By.id("ap_phone_number")).sendKeys("134567891");
	//		wd.findElement(By.id("ap_email")).sendKeys("ka@gmail.com");
	//		wd.findElement(By.id("ap_password")).sendKeys("123456789");//continue
	//		wd.findElement(By.id("continue")).click();
	//		//close the browser
	//		Thread.sleep(20000);
	//		wd.close();
			wd.findElement(By.linkText("Sign in")).click();
			wd.findElement(By.id("ap_email")).sendKeys("chebrolusaikrishna27@gmail.com");
			wd.findElement(By.id("continue")).click();
			wd.findElement(By.id("ap_password")).sendKeys("Sai123456#");
			wd.findElement(By.id("signInSubmit")).click();
			wd.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung mobile");
	
			wd.findElement(By.id("nav-search-submit-button")).click();
			
	
	}
}
