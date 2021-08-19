package com.maven.automation.testcase;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.maven.automation.pageobject.ConnectToPhoneBridgePage;
import com.maven.automation.pageobject.DispositionPage;
import com.maven.automation.pageobject.DynamicPage;
import com.maven.automation.pageobject.HomePage;
import com.maven.automation.pageobject.LoadListPage;
import com.maven.automation.pageobject.LoginPage;
import com.maven.automation.pageobject.SalesforcePage;
import com.maven.automatiuon.utilities.TestData;

public class DynamicListTest extends BaseClass{
	@Test(priority =1)
	public void loginTest() throws InterruptedException
	{
		LoginPage loginpage=PageFactory.initElements(driver,LoginPage.class);
		loginpage.loginToApplication(TestData.dynamic_username,TestData.dynamic_password);
				
	}
	
	@Test(priority=2)
	public void clickNonProductionPopup()
	{
		HomePage homepage=PageFactory.initElements(driver,HomePage.class);
		homepage.clickOnNonProductionhrPopup();	
		
	}
	
	@Test(priority=3)
	public void dynamicListCreation() throws InterruptedException
	{
		HomePage homepage=PageFactory.initElements(driver,HomePage.class);
		homepage.clickonNewList();	
		
		DynamicPage dynamicpage=PageFactory.initElements(driver,DynamicPage.class);
		dynamicpage.createDynamicList(TestData.dynamic_listname);
		
		
	}
	
	@Test(priority=4)
	public void listLoading() throws InterruptedException
	{ 
		LoadListPage loadlistpage=PageFactory.initElements(driver,LoadListPage.class);
		loadlistpage.loadListDyn();
	}
	
	@Test(priority=5)
	public void ConnectToPhoneBridge() throws InterruptedException
	{
		ConnectToPhoneBridgePage connectToPhoneBridgepage=PageFactory.initElements(driver,ConnectToPhoneBridgePage.class);
		connectToPhoneBridgepage.ConnectToPhoneBridge();
	}
	
	@Test(priority=6)
	public void callDisposition() throws InterruptedException
	{
		DispositionPage dispositionpage=PageFactory.initElements(driver,DispositionPage.class);
		dispositionpage.disposeCall();
		
	}
	
	
	@Test(priority=7)
	public void logoutTest() throws InterruptedException, IOException
	{   
		LoginPage loginpage=PageFactory.initElements(driver,LoginPage.class);
		loginpage.logoutApplication();
				
	}

}
