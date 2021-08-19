package com.maven.automation.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage{
	
	WebDriver driver;
	 
	
	public LoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
		
	}
	
	@FindBy(id="email-id-form")WebElement username;
	@FindBy(id="nextBtn")WebElement nextButton;
	@FindBy(id="password-form")WebElement password;
	@FindBy(id="loginBtn")WebElement loginButton;
	@FindBy(id="AcceptLicense")WebElement checkBox;
	@FindBy(xpath="//input[@class='btn btn-primary']")WebElement submitButton;
	@FindBy(xpath="//div[@id='navbarContent']/div[2]/div[1]/div[3]")WebElement userIcon;
	@FindBy(xpath="//ul[@id='userRightMenu']/li/div/div[2]")WebElement logoutButton;
	public void loginToApplication(String uname,String pwd) throws InterruptedException
	{
		username.sendKeys(uname);
		Thread.sleep(500);
		nextButton.click();
		password.sendKeys(pwd);
		Thread.sleep(500);
		loginButton.click();
		Thread.sleep(500);
		checkBox.click();
		Thread.sleep(500);
		submitButton.click();
		
		
	}
	public void logoutApplication() throws InterruptedException
	{   
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(userIcon)).click();
		
		logoutButton.click();
		driver.quit();
		
	}
	
	
    
}
