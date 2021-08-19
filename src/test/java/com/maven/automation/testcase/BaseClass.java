package com.maven.automation.testcase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.maven.automatiuon.utilities.BrowserFactory;
import com.maven.automatiuon.utilities.ConfigReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	


	public WebDriver driver;
	 
	public ConfigReader config;
	
	@BeforeClass 
	public void setup() throws IOException
	{
    config=new ConfigReader();
	driver=BrowserFactory.startApplication(driver,config.getBrowserName(), config.getUrl());
		
	}
	
	
	
}
