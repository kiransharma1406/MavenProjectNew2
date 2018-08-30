package com.regression.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pages.test.HomePage;
import com.pages.test.LoginPage;
import com.utility.test.BrowserFactory;

public class VerifyAutomationTesting {
	
	@Test
	public void verifyRegister()
	{
		WebDriver driver=BrowserFactory.startBrowser("Chrome", "http://practice.automationtesting.in/");
		HomePage home_page=PageFactory.initElements(driver, HomePage.class);
		home_page.clickOnMyAccountButton();
		
		LoginPage login_page=PageFactory.initElements(driver, LoginPage.class);
		login_page.loginToAutomation("kiran.bhuw.sharma@gmail.com", "kiranbhuwsharma");
		login_page.verifyLoginPage();
		
	}

}
