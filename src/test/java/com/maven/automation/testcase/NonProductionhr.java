package com.maven.automation.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NonProductionhr {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException,NullPointerException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://sa1.connectandsell.com/ConnectAndSell/");
		driver.findElement(By.id("email-id-form")).sendKeys("SnehalPatil");
        driver.findElement(By.id("nextBtn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("password-form")).sendKeys("Snehal@123");
        driver.findElement(By.id("loginBtn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("AcceptLicense")).click();
        driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
        Thread.sleep(2000);
        if(driver.findElements(By.xpath("//div[@id='nonProdHoursDialog']/div/div/div[3]/button")).size()!=0)
        {
        	try{
            	driver.findElement(By.xpath("//div[@id='nonProdHoursDialog']/div/div/div[3]/button")).click();
    		    }catch(Exception e){
    		        System.out.println(e.getMessage()); //printing exception
    		    }
        }
        else {System.out.println("Element not present");}
       /* try{
        	driver.findElement(By.xpath("//div[@id='nonProdHoursDialog']/div/div/div[3]/button")).click();
		    }catch(Exception e){
		        System.out.println(e.getMessage()); //printing exception
		    }
       /* if(isElementPresent("//div[@id='nonProdHoursDialog']/div/div/div[3]/button","xpath"))
        {
        	try{
        	driver.findElement(By.xpath("//div[@id='nonProdHoursDialog']/div/div/div[3]/button")).click();
		    }catch(Exception e){
		        System.out.println(e.getMessage()); //printing exception
		    }
        }
        else
        {*/
        driver.findElement(By.id("createList")).click();
	       // driver.findElement(By.xpath("//*[@id='Name']")).sendKeys("SalesforceList1");
	        driver.findElement(By.xpath("//form[@id='wizardForm']/div/div/div/div/div[2]/input")).sendKeys("CSVLIST9");
        }
	        
	        
	        
	        

	}
	/*static boolean isElementPresent(String element,String locatorType)
	{ boolean status=false;
	  if(locatorType.equals("xpath"))
	  {
		  status=driver.findElement(By.xpath(element)).isDisplayed();
	  }
	  return status;
    	
    }*/


