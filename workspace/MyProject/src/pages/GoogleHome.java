package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleHome {

	WebDriver driver;
	
	public GoogleHome(WebDriver driver2) 
	{
		this.driver = driver2;
	}
	
	
	@FindBy(xpath="//a[text()='Gmail']")
	WebElement linkGmail;
	
	
	public void clickOnGmail()
	{
		linkGmail.click();
	}

	
	public String getTitle()
	{
		String title = driver.getTitle();
		
		System.out.println("Your Current page title is: "+title );
		
		return title;
		
	}
}
