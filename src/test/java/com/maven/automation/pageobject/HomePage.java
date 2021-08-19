package com.maven.automation.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

WebDriver driver;
	 
	
	public HomePage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	
	@FindBy(xpath="//div[@id='nonProdHoursDialog']/div/div/div[3]/button")WebElement non_Productionpopup;
	@FindBy(id="createList") WebElement createList;
	
	public void clickOnNonProductionhrPopup()
	{
		
		try{
        	non_Productionpopup.click();
		    }catch(Exception e){
		        System.out.println(e.getMessage()); //printing exception
		    }
		
		
	}
	public void clickonNewList()
	{
		createList.click();
		
	}
}
