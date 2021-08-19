package com.maven.automation.testcase;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.automation.commanobject.CommanObject;
import com.maven.automation.pageobject.CSVPage;
import com.maven.automation.pageobject.ConnectToPhoneBridgePage;
import com.maven.automation.pageobject.DispositionPage;
import com.maven.automation.pageobject.HomePage;
import com.maven.automation.pageobject.LoadListPage;
import com.maven.automation.pageobject.LoginPage;
import com.maven.automatiuon.utilities.TestData;

public class CSVIndividualListTest extends BaseClass{
	

	@Test(priority =1)
	public void loginTest() throws InterruptedException
	{
		LoginPage loginpage=PageFactory.initElements(driver,LoginPage.class);
		loginpage.loginToApplication(TestData.salesforce_csv_username,TestData.salesforce_csv_password);
				
	}
	
	@Test(priority=2)
	public void clickNonProductionPopup()
	{
		HomePage homepage=PageFactory.initElements(driver,HomePage.class);
		homepage.clickOnNonProductionhrPopup();	
		
	}
	
	
	@Test(priority=3)
	public void CSV_IndividualList() throws InterruptedException
	{
		HomePage homepage=PageFactory.initElements(driver,HomePage.class);
		homepage.clickonNewList();	
		
		CSVPage csvpage=PageFactory.initElements(driver,CSVPage.class);
		csvpage.createCSVIndividualList(TestData.cvsIndividual_listname);
		
		
	}
	
	@Test(priority=4)
	public void listLoading() throws InterruptedException
	{ 
		LoadListPage loadlistpage=PageFactory.initElements(driver,LoadListPage.class);
		loadlistpage.loadList();
	}
	
	@Test(priority=5)
	public void connectToPhoneBridge() throws InterruptedException
	{
		ConnectToPhoneBridgePage connectToPhoneBridgepage=PageFactory.initElements(driver,ConnectToPhoneBridgePage.class);
		connectToPhoneBridgepage.ConnectToPhoneBridge();
	}
	
	@Test(priority=6)
	public void callDisposition() throws InterruptedException
	{
		DispositionPage dispositionpage=PageFactory.initElements(driver,DispositionPage.class);
		dispositionpage.disposeCallCsvInd();
		
	}
	
	@Test(priority=7)
	public void logoutTest() throws InterruptedException, IOException
	{   
		LoginPage loginpage=PageFactory.initElements(driver,LoginPage.class);
		loginpage.logoutApplication();
	}

}
