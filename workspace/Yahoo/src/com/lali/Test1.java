package com.lali;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Auto\\Driver\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver(); 
			
				
				driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.yahoo.com");
				Object currentURL = driver.getCurrentUrl();
			System.out.println(currentURL);
			driver.findElement(By.xpath(".//*[@id='uh-mail-link']/span[1]")).click();
				Thread.sleep(2000);
				String strl =driver.findElement(By.id("mbr-login-greeting")).getText();
				System.out.println(strl);
				//driver.findElement(By.xpath(".//*[@id='login-username']")).sendKeys("mishra.abhineet");
//driver.findElement(By.xpath(".//*[@id='login-signin']")).click();
	//		driver.findElement(By.xpath(".//*[@id='login-passwd']")).sendKeys("abhi19mish");
		//	driver.findElement(By.xpath(".//*[@id='login-signin']")).click();
			
	}

}
