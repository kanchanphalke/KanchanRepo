package com.practicle;

import java.util.ArrayList;

import org.apache.xerces.util.SynchronizedSymbolTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SwitchWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "F:\\Auto\\Driver\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://business.twitter.com/en/advertising.html");
		WebElement letsGo = driver.findElement(By.xpath("//*[@id='main-content']/div[8]/div/div/div/div[2]/a/button"));
		System.out.println("Now clicking to "+letsGo.getText());
		letsGo.click();
		ArrayList<String> wins = new ArrayList<String>(driver.getWindowHandles());
		int noOfWindows = wins.size();
		System.out.println("noOfWindows : "+noOfWindows);
		
		
		

	}

}
