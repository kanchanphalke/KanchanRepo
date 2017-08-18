package com.practicle;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class TestWithIE {

	//@SuppressWarnings("deprecation")
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "F:\\Auto\\Driver\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://medialize.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(2000);
		WebElement btn = driver.findElement(By.xpath("//*[@class = 'context-menu-one btn btn-neutral']"));
		Actions act = new Actions(driver);
		act.contextClick(btn).perform();
		WebElement subDelete = driver.findElement(By.xpath("//ul/li[5]/span"));
		if(subDelete.isDisplayed())
			subDelete.click();
		Alert alert = driver.switchTo().alert();
		String deleteText = alert.getText();
		Assert.assertEquals("Wrong text on alert", "clicked: delete",deleteText );
		alert.accept();
		
		

		
		

		

	}

}
						