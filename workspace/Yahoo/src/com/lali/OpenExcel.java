package com.lali;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Auto\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
	
		// Read data from Excel sheet
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.get("https://www.yahoo.com");
		String currentURL = driver.getCurrentUrl();
		//driver.findElement(By.xpath(".//*[@id='uh-mail-link']/span[1]")).click();
		FileInputStream fi = new FileInputStream("G:\\TestData.xls");
		
		Workbook w = new HSSFWorkbook(fi);
		HSSFSheet s = (HSSFSheet) w.getSheetAt(0);
		System.out.println(s.getLastRowNum());
		for(int row = 0;row <= s.getLastRowNum();row++){

//		    String Username = ((Object) s.getCellComment(0,row)).getContents();
//		    System.out.println("Username" +Username);
//		    driver.get("AppURL");
//		    driver.findElement(By.id(".//*[@id='login-username']")).sendKeys(Username);
//
//		    String password= s.getCellComment(1, row).getContents();
//		    System.out.println("Password "+password);

//		    driver.findElement(By.id("txtPassword")).sendKeys(password);
//
//		    driver.findElement(By.id("btnLogin")).click();
		   }
		 }
				
				
				
		
		
				
		
	}


