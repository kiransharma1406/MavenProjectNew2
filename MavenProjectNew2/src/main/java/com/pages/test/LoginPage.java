package com.pages.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

WebDriver driver1;
	
	//@FindBy(id="username") WebElement Username;
	//@FindBy(name="password") WebElement Password;
	//@FindBy(xpath="//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]") WebElement Signin;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"username\"]")
	WebElement Username;
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"password\"]")
	WebElement Password;
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")
	WebElement Signin;
	
	public LoginPage(WebDriver driver)
	{
		this.driver1=driver;
	}

	public void loginToAutomation(String uid, String pass)
	{
		Username.sendKeys(uid);
		Password.sendKeys(pass);
		Signin.click();	
	}

	public boolean verifyLoginPage()
	{
		String expectedurl=driver1.getCurrentUrl();
		String actualurl= "http://practice.automationtesting.in/my-account/";
		
		if(expectedurl.equalsIgnoreCase(actualurl))
		{
			return true;	
		}
		else 
		{
			return false;
		}
		
	  }
	}

	
	

