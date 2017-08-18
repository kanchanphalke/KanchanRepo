package com.practicle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import pages.BrowserFactory;
import pages.GmailPasswordEnterPage;
import pages.GmailSignIn;
import pages.GoogleHome;
import pages.HandleExcelSheet;
import pages.Inbox;

public class AbhiGmailLogin {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = BrowserFactory.startBrowser("firefox","https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		GoogleHome homeObj = PageFactory.initElements(driver, GoogleHome.class);
		//GoogleHome homeObj = new GoogleHome(driver);
		String homeTitle = homeObj.getTitle();
		Assert.assertEquals("Google",homeTitle);
		homeObj.clickOnGmail();
		
		GmailSignIn signInObj = PageFactory.initElements(driver, GmailSignIn.class);
		//GmailSignIn signInObj = new GmailSignIn(driver);
		String signINTitle = signInObj.getTitle();
		Assert.assertEquals("Gmail",signINTitle );
		signInObj.goToPasswordPage();
		
		GmailPasswordEnterPage pwdPageObj = PageFactory.initElements(driver, GmailPasswordEnterPage.class);
		//GmailPasswordEnterPage pwdPageObj = new GmailPasswordEnterPage(driver);
		String pwdPageTitle = pwdPageObj.getTitle();
		Assert.assertEquals("Gmail", pwdPageTitle);
		pwdPageObj.signIn();
		
		Inbox inboxObj = new Inbox(driver);
		String inboxTitle = inboxObj.getTitle();
		Assert.assertEquals("Gmail", inboxTitle);
		

		
		
		
		
		
	}

}
