package com.maven.automation.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConnectToPhoneBridgePage {

WebDriver driver;
	 
	
	public ConnectToPhoneBridgePage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(id="statusButtonWrapper") WebElement callMeButton;
	@FindBy(xpath="//form[@id='callMeForm']/div[2]/div[1]/div[2]/div/div/input") WebElement phoneNumber;
	@FindBy(id="callMeBtn") WebElement callMeButton_popup;
	@FindBy(xpath="//a[@class='btn btn-sm navbar-btn btn-success']") WebElement goButton;

	public void ConnectToPhoneBridge() throws InterruptedException
	{   for(int i=0;i<3;i++)
	    {
		callMeButton.click();
		Thread.sleep(1000);
		phoneNumber.sendKeys("+919503019034");
		Thread.sleep(500);
		callMeButton_popup.click();
		Thread.sleep(30000);
		 if(driver.findElements(By.xpath("//a[@class='btn btn-sm navbar-btn btn-success']")).size()!=0)
		  {
		  WebDriverWait wait=new WebDriverWait(driver,360);
		  wait.until(ExpectedConditions.visibilityOf(goButton)).click();
		  break;
		  }
		}
	
	   Thread.sleep(10000);
	}
}
