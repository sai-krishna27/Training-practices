package com.autoit.fileupload;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String[] args) throws InterruptedException, IOException {
		//register the chrome driver
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\95\\chromedriver.exe");
		//create an obj to the driver -obj to the browser
		WebDriver wd=new ChromeDriver();//wd is the controller obj to web browser
		//maxmize the screen
		wd.manage().window().maximize();
	    wd.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
		//web url 
		wd.get("https://www.ilovepdf.com/pdf_to_word");
		wd.findElement(By.id("pickfiles")).click();
		Runtime.getRuntime().exec("F:\\Autoit\\filleupload.exe");
		//processTask
		wd.findElement(By.xpath("//*[@id=\'processTask\']")).click();
	}

}

