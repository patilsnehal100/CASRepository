package com.maven.automation.pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.commanobject.CommanObject;

public class CSVPage {
	
WebDriver driver;
	 
	
	public CSVPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	

	@FindBy(xpath="//form[@id='wizardForm']/div/div/div/div/div[2]/input")WebElement listName;
	@FindBy(xpath="//*[@id='CallListType']")List<WebElement> selectDataSource;
	@FindBy(xpath="//button[@id='wizardnext']")WebElement nextButton;
	@FindBy(xpath="//*[@id='DialingTypes']")List<WebElement> dialerSession;
	@FindBy(xpath="//input[@id='AssignmentType']")List<WebElement> selectListAssignment;
	@FindBy(xpath="//*[@id='uploadFile']/div/div[2]")WebElement chooseFileButton;
	@FindBy(xpath="//button[text()='Close']")WebElement closeButton;
	@FindBy(xpath="//table[@role='grid']/tbody/tr[3]/td[1]")WebElement SelectListName;
	@FindBy(xpath="//button[@id='callListLightning']")WebElement LoadListButton;
	@FindBy(id="dialerMode")List<WebElement> SelectDialerSession;
	@FindBy(xpath="//button[@id='sachin']")WebElement selectUser;
	@FindBy(xpath="//*[@id='searchUser']/div[2]/div/div/ul/li[2]")WebElement selectUserDropdown;
	
	

	public void createCSVIndividualList(String listname) throws InterruptedException
	{
	
	listName.sendKeys(listname);
	selectDataSource.get(0).click();
	nextButton.click();
	dialerSession.get(1).click();
	nextButton.click();
	selectListAssignment.get(0).click();
	nextButton.click();
	Thread.sleep(2000);
	nextButton.click();
	chooseFileButton.click();
	Thread.sleep(1000);
	CommanObject.fileUplode();
	Thread.sleep(3000);
	nextButton.click();
	Thread.sleep(3000);
	nextButton.click(); 
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.visibilityOf(closeButton)).click();

	}
	
	public void createCSVLeadPoolList(String listname) throws InterruptedException
	{

		listName.sendKeys(listname);
		selectDataSource.get(0).click();
		nextButton.click();
		dialerSession.get(1).click();
		nextButton.click();
		selectListAssignment.get(1).click();
		selectUser.click();
		selectUserDropdown.click();
		nextButton.click();
		Thread.sleep(2000);
		nextButton.click();
		chooseFileButton.click();
		Thread.sleep(1000);
		CommanObject.fileUplode();
		Thread.sleep(3000);
		nextButton.click();
		Thread.sleep(3000);
		nextButton.click(); 
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(closeButton)).click();
		
	
	}
	
	public void createCSVList(String listname,int listTypeIndex) throws InterruptedException
	{listName.sendKeys(listname);
	 selectDataSource.get(0).click();
	 nextButton.click();
	 dialerSession.get(1).click();
	 nextButton.click();
	 switch(listTypeIndex)
	 {
	 case 0:
	 selectListAssignment.get(0).click();
	 nextButton.click();
	 Thread.sleep(1000);
	 nextButton.click();
	 chooseFileButton.click();
	 CommanObject.fileUplode();
	 Thread.sleep(3000);
	 nextButton.click();
	 Thread.sleep(3000);
	 break;
	 case 1:
	 selectListAssignment.get(1).click();
	 selectUser.click();
	 selectUserDropdown.click();
	 nextButton.click();
	 Thread.sleep(1000);
	 nextButton.click();
	 chooseFileButton.click();
	 CommanObject.fileUplode();
	 Thread.sleep(3000);
	 nextButton.click();
	 Thread.sleep(3000);
	 break;
	 
	 }
	 nextButton.click(); 
	 WebDriverWait wait=new WebDriverWait(driver,20);
	 wait.until(ExpectedConditions.visibilityOf(closeButton)).click();
		
	}
	    	
		
		
}
	
	
	
	
