package pages;

import java.io.IOException;
import java.util.LinkedHashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GmailSignIn {
	
	WebDriver driver;
	
	public GmailSignIn(WebDriver driver3)
	{
		this.driver = driver3;
	}
	
	@FindBy(id="identifierId")
	WebElement txtUserName;
	//By userName = By.xpath(".//*[@id='identifierId']");
	
	@FindBy(id="identifierNext")
	WebElement txtNext;
	//By next = By.xpath(".//*[@id='identifierNext']//*[text()='Next']");
	
	public void enterUserName() throws IOException
	{
		LinkedHashMap map = HandleExcelSheet.takeData();
		
		String id = (String) map.get(0);

		txtUserName.sendKeys(id);
	}
	
	public void clickToNextAfterEnteringUserName()
	{
		txtNext.click();
	}
	
	public String getTitle()
	{
		String title = driver.getTitle();
		
		System.out.println("Your Current page title is: "+title );
		
		return title;
		
	}
	
	public void goToPasswordPage() throws IOException
	{
		this.enterUserName();
		this.clickToNextAfterEnteringUserName();
		
	}
	
	

}
