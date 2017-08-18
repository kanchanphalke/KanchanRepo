package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.gargoylesoftware.htmlunit.javascript.configuration.BrowserName;

public class BrowserFactory {
	
	static WebDriver driver;
	
	
	public static WebDriver startBrowser(String browserName,String URL){
		
		if(browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "F:\\Auto\\Driver\\geckodriver-v0.18.0-win64\\geckodriver.exe");
			DesiredCapabilities capabilities=DesiredCapabilities.firefox();
			capabilities.setCapability("marionette", false);
			driver = new FirefoxDriver(capabilities);
		}
		
		else if(browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "F:\\Auto\\Driver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver(); 
		}
		
		else if(browserName.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver", "F:\\Auto\\Driver\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver(); 
		}
		
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(URL);
		return driver;
		
		
		
		
	}
	

}
