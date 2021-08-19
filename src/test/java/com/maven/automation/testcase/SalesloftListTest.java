package com.maven.automation.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.maven.automation.pageobject.ConnectToPhoneBridgePage;
import com.maven.automation.pageobject.HomePage;
import com.maven.automation.pageobject.LoadListPage;
import com.maven.automation.pageobject.LoginPage;
import com.maven.automation.pageobject.SalesforcePage;
import com.maven.automation.pageobject.SalesloftPage;

public class SalesloftListTest extends BaseClass{
	@Test(priority =1)
	public void loginTest() throws InterruptedException
	{
		LoginPage loginpage=PageFactory.initElements(driver,LoginPage.class);
		loginpage.loginToApplication("Snehalst","Snehal@123");
				
	}
	
	/*@Test(priority=2)
	public void clickNonProductionPopup()
	{
		HomePage homepage=PageFactory.initElements(driver,HomePage.class);
		homepage.clickOnNonProductionhrPopup();	
		
	}*/
	
	@Test(priority=3)
	public void salesloftListCreation() throws InterruptedException
	{
		HomePage homepage=PageFactory.initElements(driver,HomePage.class);
		homepage.clickonNewList();	
		
		SalesloftPage salesloftPage=PageFactory.initElements(driver,SalesloftPage.class);
		salesloftPage.createSalesloftList("SalesloftList5",1);
		
		
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
