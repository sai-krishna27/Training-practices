package com.sikuli.image.finder;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliTest {
	public static void main(String[] args) throws InterruptedException, IOException, FindFailed {
		//register the chrome driver
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\95\\chromedriver.exe");
		//create an obj to the driver -obj to the browser
		WebDriver wd=new ChromeDriver();//wd is the controller obj to web browser
		//maxmize the screen
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
		wd.get("https://www.amazon.in/");
		Screen sc=new Screen();
		Pattern p3=new Pattern("F:\\search.png");
		sc.type(p3,"samsung");
		Pattern p4=new Pattern("F:\\button.png");
		sc.click(p4);
	
	}

}
