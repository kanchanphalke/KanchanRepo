package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GmailPasswordEnterPage {
	
	WebDriver driver;
	
	public GmailPasswordEnterPage(WebDriver driver4) 
	{
		this.driver = driver4;
	}
	
	
	@FindBy(xpath=".//*[@id='password']//input")
	WebElement txtPassword;
	
	@FindBy(id="passwordNext")
	WebElement btnNext;
	//By next = By.xpath(".//*[@id='passwordNext']//*[text()='Next']");
	
	public void enterPassword()
	{
		txtPassword.sendKeys("abh!neetM7890");
	}
	
	public void clickNextAfterEnteringPassword()
	{
		btnNext.click();
	}
	
	public void signIn()
	{
		this.enterPassword();
		this.clickNextAfterEnteringPassword();
	}
	
	public String getTitle()
	{
		String title = driver.getTitle();
		System.out.println("Your Current page title is: "+title);
		return title;
	}
	
	
	
}
