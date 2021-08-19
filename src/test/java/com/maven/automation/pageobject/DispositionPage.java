package com.maven.automation.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DispositionPage {
	
WebDriver driver;
	 
	
	public DispositionPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}

	
	@FindBy(xpath="//form[@id='DisposeForm']/div[1]/button[1]") WebElement hangUpButton;
	@FindBy(xpath="//form[@id='DisposeForm']/div[2]/div[5]/div/div/div/div[2]/div/div[2]/select") WebElement selectDispositionField;
	@FindBy(xpath="//form[@id='DisposeForm']/div[2]/div[5]/div/div/div/div[2]/div/div[2]/select") WebElement csvindselectDispositionField;
	@FindBy(xpath="//form[@id='DisposeForm']/div[2]/div[5]/div/div/div/div[2]/div/div[3]/select") WebElement csvleadselectDispositionField;
	@FindBy(xpath="//form[@id='DisposeForm']/div[2]/div[5]/div/div/div/div[2]/div/div[3]/select") WebElement salesforceleadselectDispositionField;
	@FindBy(xpath="//form[@id='DisposeForm']/div[1]/button[3]") WebElement pauseButton;
	@FindBy(xpath="//form[@id='DisposeForm']/div[2]/div[5]/div/div/div/div[2]/div/div[3]/select") WebElement salesloftteamselectDispositionField;
	@FindBy(xpath="//*[@id='Disposition']") WebElement SelectDisposition;
	
	public void disposeCallById() throws InterruptedException
	{
		hangUpButton.click();
		//selectDispositionField.click();
		Thread.sleep(3000);
		Select selectoption=new Select(SelectDisposition);
		//selectoption.selectByVisibleText("Interest, Call Back Later");
		 selectoption.selectByValue("78094");
		Thread.sleep(3000);
		pauseButton.click();
		
	}
	
	
	public void disposeCallCsvInd() throws InterruptedException
	{
		hangUpButton.click();
		//selectDispositionField.click();
		Thread.sleep(3000);
		Select selectoption=new Select(csvindselectDispositionField);
		//selectoption.selectByVisibleText("Interest, Call Back Later");
		 selectoption.selectByValue("78094");
		Thread.sleep(3000);
		pauseButton.click();
		
	}
	
	public void disposeCallCsvLead() throws InterruptedException
	{
		hangUpButton.click();
		//selectDispositionField.click();
		Thread.sleep(3000);
		Select selectoption=new Select(csvleadselectDispositionField);
		//selectoption.selectByVisibleText("Interest, Call Back Later");
		 selectoption.selectByValue("78094");
		Thread.sleep(3000);
		pauseButton.click();
	}
	
	public void disposeCallSalesforceInd() throws InterruptedException
	{
		hangUpButton.click();
		//selectDispositionField.click();
		Thread.sleep(3000);
		Select selectoption=new Select(csvleadselectDispositionField);
		//selectoption.selectByVisibleText("Interest, Call Back Later");
		 selectoption.selectByValue("78094");
		Thread.sleep(3000);
		pauseButton.click();
		
	}
	
	public void disposeCall() throws InterruptedException
	{
		hangUpButton.click();
		//selectDispositionField.click();
		Thread.sleep(3000);
		Select selectoption=new Select(salesforceleadselectDispositionField);
		//selectoption.selectByVisibleText("Interest, Call Back Later");
		 selectoption.selectByValue("78094");
		Thread.sleep(3000);
		pauseButton.click();
		
	}
	
	public void disposeCallSalesloftTeam() throws InterruptedException
	{
		hangUpButton.click();
		//selectDispositionField.click();
		Thread.sleep(3000);
		Select selectoption=new Select(salesloftteamselectDispositionField);
		//selectoption.selectByVisibleText("Interest, Call Back Later");
		 selectoption.selectByValue("78094");
		Thread.sleep(3000);
		pauseButton.click();
		
	}
	
}
