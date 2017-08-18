package pages;

import org.openqa.selenium.WebDriver;

public class Inbox {
	WebDriver driver;
	public Inbox(WebDriver driver5){
		this.driver = driver5;	
	}
	
	public String getTitle(){
		String title = driver.getTitle();
		System.out.println("Your Current page title is: "+title);
		return title;
	}

	
}
