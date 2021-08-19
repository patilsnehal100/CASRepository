package com.maven.automation.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.maven.automation.pageobject.CSVPage;
import com.maven.automation.pageobject.ConnectToPhoneBridgePage;
import com.maven.automation.pageobject.HomePage;
import com.maven.automation.pageobject.LoadListPage;
import com.maven.automation.pageobject.LoginPage;
import com.maven.automation.pageobject.SalesforcePage;

public class SalesforceListTest extends BaseClass{
	@Test(priority =1)
	public void loginTest() throws InterruptedException
	{
		LoginPage loginpage=PageFactory.initElements(driver,LoginPage.class);
		loginpage.loginToApplication("SnehalPatil","Snehal@123");
				
	}
	
	/*@Test(priority=2)
	public void clickNonProductionPopup()
	{
		HomePage homepage=PageFactory.initElements(driver,HomePage.class);
		homepage.clickOnNonProductionhrPopup();	
		
	}*/
	
	@Test(priority=3)
	public void salesforceListCreation() throws InterruptedException
	{
		HomePage homepage=PageFactory.initElements(driver,HomePage.class);
		homepage.clickonNewList();	
		
		SalesforcePage salesforcepage=PageFactory.initElements(driver,SalesforcePage.class);
		salesforcepage.createSalesforceList("Salesforce12",0);
		
		
	}
	
	@Test(priority=4)
	public void listLoading() throws InterruptedException
	{ 
		LoadListPage loadlistpage=PageFactory.initElements(driver,LoadListPage.class);
		loadlistpage.loadList();
	}
	
	@Test(priority=5)
	public void ConnectToPhoneBridge() throws InterruptedException
	{
		ConnectToPhoneBridgePage connectToPhoneBridgepage=PageFactory.initElements(driver,ConnectToPhoneBridgePage.class);
		connectToPhoneBridgepage.ConnectToPhoneBridge();
	}


}
