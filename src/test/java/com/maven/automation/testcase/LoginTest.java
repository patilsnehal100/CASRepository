package com.maven.automation.testcase;

import java.io.IOException;


import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.maven.automation.pageobject.ConnectToPhoneBridgePage;
import com.maven.automation.pageobject.HomePage;
import com.maven.automation.pageobject.LoadListPage;
import com.maven.automation.pageobject.LoginPage;
import com.maven.automatiuon.utilities.ConfigReader;
import com.maven.automatiuon.utilities.TestData;

public class LoginTest extends BaseClass{
	
	
	
	@Test(priority=1)
	public void loginTest() throws InterruptedException, IOException
	{   
		LoginPage loginpage=PageFactory.initElements(driver,LoginPage.class);
		loginpage.loginToApplication(TestData.salesforce_csv_username,TestData.salesforce_csv_password);
				
	}
	
	/*@Test(priority=2)
	public void clickOnNonProductionhrPopup()
	{
		HomePage homepage=PageFactory.initElements(driver,HomePage.class);
		homepage.clickOnNonProductionhrPopup();	
		
	}*/
	

	/*@Test(priority=3)
	public void logoutTest() throws InterruptedException, IOException
	{   
		LoginPage loginpage=PageFactory.initElements(driver,LoginPage.class);
		loginpage.logoutApplication();
				
	}*/
	
	@Test(priority=3)
	public void listLoading() throws InterruptedException
	{ 
		LoadListPage loadlistpage=PageFactory.initElements(driver,LoadListPage.class);
		loadlistpage.loadList();
	}
	
	@Test(priority=4)
	public void ConnectToPhoneBridge() throws InterruptedException
	{
		ConnectToPhoneBridgePage connectToPhoneBridgepage=PageFactory.initElements(driver,ConnectToPhoneBridgePage.class);
		connectToPhoneBridgepage.ConnectToPhoneBridge();
	}
	
	@Test(priority=5)
	public void logoutTest() throws InterruptedException, IOException
	{   
		LoginPage loginpage=PageFactory.initElements(driver,LoginPage.class);
		loginpage.logoutApplication();
				
	}
	
	

}
