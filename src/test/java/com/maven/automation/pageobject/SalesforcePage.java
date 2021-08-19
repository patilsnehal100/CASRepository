package com.maven.automation.pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SalesforcePage {
	
WebDriver driver;
	 
	
	public SalesforcePage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	

	@FindBy(xpath="//form[@id='wizardForm']/div/div/div/div/div[2]/input")WebElement listName;
	@FindBy(xpath="//*[@id='CallListType']")List<WebElement> selectDataSource;
	@FindBy(xpath="//button[@id='wizardnext']")WebElement nextButton;
	@FindBy(xpath="//*[@id='DialingTypes']")List<WebElement> dialerSession;
	@FindBy(xpath="//input[@id='AssignmentType']")List<WebElement> selectListAssignment;
	@FindBy(xpath="//*[@id='CrmListType']") List<WebElement> salesforceListSelection;
	@FindBy(xpath="//div[@id='CRMReportSelection']/ul/li[4]/div/span[1]") WebElement report;
	@FindBy(xpath="//div[@id='CRMReportSelection']/ul/li[4]/ul/li[2]/div/span") WebElement reportSubtype;
	@FindBy(xpath="//button[text()='Close']")WebElement closeButton;
	@FindBy(xpath="//div[@id='CrmObjectSelection']/div/div[2]/span/span/span[2]") WebElement objectSelectionfield;
	@FindBy(xpath="//div[@id='ObjectType-list']/div[3]/ul/li[1]") WebElement objectTask;
	@FindBy(xpath="//div[@id='ObjectType-list']/div[3]/ul/li[3]") WebElement objectLead;
	@FindBy(xpath="//span[@id='recordCount']") WebElement listImportpage;
	
	public void createSalesforceIndividualList(String listname) throws InterruptedException
	{listName.sendKeys(listname);
	selectDataSource.get(1).click();
	nextButton.click();
	dialerSession.get(1).click();
	nextButton.click();
	selectListAssignment.get(0).click();
	nextButton.click();
	Thread.sleep(2000);
	nextButton.click();
	salesforceListSelection.get(0).click();
	report.click();
	Thread.sleep(2000);
	reportSubtype.click();
    nextButton.click();
    Thread.sleep(2000);
    nextButton.click();
    WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.visibilityOf(closeButton)).click();
	}
	
	public void createSalesforceLeadpoolList(String listname) throws InterruptedException
	{listName.sendKeys(listname);
	selectDataSource.get(1).click();
	nextButton.click();
	dialerSession.get(1).click();
	nextButton.click();
	selectListAssignment.get(2).click();
	nextButton.click();
	Thread.sleep(2000);
	nextButton.click();
	salesforceListSelection.get(1).click();
	objectSelectionfield.click();
	Thread.sleep(1000);
	objectTask.click();
	Thread.sleep(2000);
    nextButton.click();
    Thread.sleep(2000);
	nextButton.click();
    Thread.sleep(2000);
    nextButton.click();
    WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.visibilityOf(closeButton)).click();
	}
	
	public void createSalesforceTemplateList(String listname) throws InterruptedException
	{
		listName.sendKeys(listname);
		selectDataSource.get(1).click();
		nextButton.click();
		dialerSession.get(1).click();
		nextButton.click();
		selectListAssignment.get(1).click();
		nextButton.click();
		Thread.sleep(2000);
		nextButton.click();
		salesforceListSelection.get(1).click();
		objectSelectionfield.click();
		Thread.sleep(1000);
		objectLead.click();
		Thread.sleep(2000);
	    nextButton.click();
	    Thread.sleep(2000);
		nextButton.click();
	    Thread.sleep(2000);
	    nextButton.click();
	    WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(closeButton)).click();
		
		
	}
	
	public void createSalesforceList(String listname,int listTypeIndex) throws InterruptedException
	{  listName.sendKeys(listname);
	   selectDataSource.get(1).click();
	   nextButton.click();
	   dialerSession.get(1).click();
	   nextButton.click();
	   switch(listTypeIndex)
	   {
	   case 0:
		    selectListAssignment.get(0).click();
			nextButton.click();
			Thread.sleep(2000);
			nextButton.click();
			salesforceListSelection.get(0).click();
			report.click();
			Thread.sleep(2000);
			reportSubtype.click();
		    nextButton.click();
		    break;
	   case 1:
		    selectListAssignment.get(1).click();
			nextButton.click();
			Thread.sleep(2000);
			nextButton.click();
			salesforceListSelection.get(1).click();
			objectSelectionfield.click();
			Thread.sleep(500);
			objectLead.click();
			Thread.sleep(2000);
		    nextButton.click();
		    Thread.sleep(2000);
			nextButton.click();
			break;
	   case 2:
		    selectListAssignment.get(2).click();
			nextButton.click();
			Thread.sleep(2000);
			nextButton.click();
			salesforceListSelection.get(1).click();
			objectSelectionfield.click();
			objectTask.click();
			Thread.sleep(2000);
		    nextButton.click();
		    Thread.sleep(2000);
			nextButton.click();
			break;
	   }
	   Thread.sleep(2000);
	   listImportpage.click();
	   nextButton.click();
	   WebDriverWait wait=new WebDriverWait(driver,20);
	   wait.until(ExpectedConditions.visibilityOf(closeButton)).click();
		
	}
}
