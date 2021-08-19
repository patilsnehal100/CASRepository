package com.maven.automation.pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class DynamicPage {
	
WebDriver driver;
	 
	
	public DynamicPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	

	@FindBy(xpath="//form[@id='wizardForm']/div/div/div/div/div[2]/input")WebElement listName;
	@FindBy(xpath="//*[@id='CallListType']")List<WebElement> selectDataSource;
	@FindBy(xpath="//button[@id='wizardnext']")WebElement nextButton;
	@FindBy(xpath="//*[@id='DialingTypes']")List<WebElement> dialerSession;
	@FindBy(xpath="//div[@id='singleUserSelectionDiv']/div/div[2]/span") WebElement selectUser;
	@FindBy(xpath="//form[@id='wizardForm']/div[4]/div/span") WebElement selectEntityField;
	@FindBy(xpath="//div[@id='ObjectType-list']/div[3]/ul/li[1]") WebElement selectEntitydropdown;
	@FindBy(xpath="//form[@id='wizardForm']/fieldset/span") WebElement selectViewField;
	@FindBy(xpath="//div[@id='View-list']/div[3]/ul/li[4]") WebElement selectViewDropdown;
	@FindBy(xpath="//span[@id='recordCount']") WebElement listImportpage;
	@FindBy(xpath="//button[text()='Close']")WebElement closeButton;
	
	
	public void createDynamicList(String listname) throws InterruptedException
	{
		listName.sendKeys(listname);
		selectDataSource.get(1).click();
		nextButton.click();
		dialerSession.get(1).click();
		nextButton.click();
		selectUser.click();
		nextButton.click();
		selectEntityField.click();
		selectEntitydropdown.click();
		Thread.sleep(1000);
		nextButton.click();
		selectViewField.click();
		Thread.sleep(1000);
		selectViewDropdown.click();
        nextButton.click();
        Thread.sleep(1000);
        listImportpage.click();
        nextButton.click();
        WebDriverWait wait=new WebDriverWait(driver,20);
    	wait.until(ExpectedConditions.visibilityOf(closeButton)).click();

	}

}
