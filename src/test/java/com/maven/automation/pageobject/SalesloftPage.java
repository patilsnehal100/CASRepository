package com.maven.automation.pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SalesloftPage {
	
WebDriver driver;
	 
	
	public SalesloftPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	

	@FindBy(xpath="//form[@id='wizardForm']/div/div/div/div/div[2]/input")WebElement listName;
	@FindBy(xpath="//*[@id='CallListType']")List<WebElement> selectDataSource;
	@FindBy(xpath="//button[@id='wizardnext']")WebElement nextButton;
	@FindBy(xpath="//*[@id='DialingTypes']")List<WebElement> dialerSession;
	@FindBy(xpath="//div[@id='singleUserSelectionDiv']/div/div[2]/span") WebElement selectUser;
	@FindBy(xpath="//div[@id='CadenceTypeDiv']/label") List<WebElement> cadenceSelection;
	@FindBy(xpath="//form[@id='wizardForm']/div[4]/span/span/span") WebElement cadenceField;
	@FindBy(xpath="//div[@id='ContactList-list']/div[2]/ul/li[1]") WebElement mycadenceFromdropdown;
	@FindBy(xpath="//div[@id='ContactList-list']/div[2]/ul/li[5]") WebElement teamcadenceFromdropdown;
	@FindBy(xpath="//button[text()='Close']")WebElement closeButton;
	
	public void createSalesloftList(String listname,int cadence_index) throws InterruptedException
	{   listName.sendKeys(listname);
		selectDataSource.get(1).click();
		nextButton.click();
		dialerSession.get(1).click();
		nextButton.click();
		selectUser.click();
		nextButton.click();
		switch(cadence_index)
		{case 0: 
		 cadenceSelection.get(0).click();
		 Thread.sleep(1000);
		 cadenceField.click();
		 mycadenceFromdropdown.click();
		 nextButton.click();
		 break;
		 case 1:
	     cadenceSelection.get(1).click();
	     Thread.sleep(2000);
		 cadenceField.click();
		 Thread.sleep(1000);
		 teamcadenceFromdropdown.click();
		 nextButton.click();
		 break;
	     default:System.out.println("Index not found");
		 }
		Thread.sleep(2000);
        nextButton.click();
        WebDriverWait wait=new WebDriverWait(driver,20);
    	wait.until(ExpectedConditions.visibilityOf(closeButton)).click();
    	
	}
	
	public void createMyCadenceList(String listname) throws InterruptedException
	{
		listName.sendKeys(listname);
		selectDataSource.get(1).click();
		nextButton.click();
		dialerSession.get(1).click();
		nextButton.click();
		selectUser.click();
		nextButton.click();
		cadenceSelection.get(0).click();
		Thread.sleep(2000);
		cadenceField.click();
		Thread.sleep(1000);
		mycadenceFromdropdown.click();
		nextButton.click();
		Thread.sleep(2000);
        nextButton.click();
        WebDriverWait wait=new WebDriverWait(driver,20);
    	wait.until(ExpectedConditions.visibilityOf(closeButton)).click();
		
	}
	
	public void createTeamCadenceList(String listname) throws InterruptedException
	{  listName.sendKeys(listname);
	   selectDataSource.get(1).click();
	   nextButton.click();
	   dialerSession.get(1).click();
	   nextButton.click();
	   selectUser.click();
	   nextButton.click();
	   cadenceSelection.get(1).click();
	   Thread.sleep(2000);
	   cadenceField.click();
	   Thread.sleep(1000);
	   teamcadenceFromdropdown.click();
	   nextButton.click();
	   Thread.sleep(2000);
       nextButton.click();
       WebDriverWait wait=new WebDriverWait(driver,20);
   	   wait.until(ExpectedConditions.visibilityOf(closeButton)).click();
		
	}

}
