package com.maven.automation.pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoadListPage {
	
WebDriver driver;
	 
	
	public LoadListPage(WebDriver ldriver)
	{
		this.driver=ldriver;
		
	}
	@FindBy(xpath="//table[@role='grid']/tbody/tr[3]/td[2]") WebElement listCreated;
	@FindBy(xpath="//table[@role='grid']/tbody/tr[3]/td[1]") WebElement listSelected;
	@FindBy(xpath="//button[@id='callListLightning']") WebElement loadListButton;
	@FindBy(xpath="//form[@id='wizardForm']/fieldset/div[2]/div/ul/li/div/span[1]/span") List<WebElement> sessionRadioButton;
	@FindBy(xpath="//*[@id='contactGrid']/div[2]/div[1]/table/tbody/tr[1]/td[5]") WebElement actualListName;
	@FindBy(id="callList-submit")WebElement submitButton;
	
	public void loadList() throws InterruptedException
	{
		listSelected.click();
		loadListButton.click();
		//sessionRadioButton.get(1).click();
		Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(submitButton)).click();
		//submitButton.click();
		Thread.sleep(1000);
		System.out.println("List loaded successfully");
		
		
	}
	
	public void loadListDyn() throws InterruptedException
	{
		listSelected.click();
		loadListButton.click();
		//sessionRadioButton.get(1).click();
		Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(submitButton)).click();
        Thread.sleep(1000);
		System.out.println("List loaded successfully");
		
	}
	
	
}
