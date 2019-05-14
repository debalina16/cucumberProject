/**
 * 
 */
package com.acttime;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.actitime.genericlib.FileLib;
import com.actitime.genericlib.WebdriverCommonLib;

/**
 * @author Debalina
 *
 */
public class ActitimeTest {
	/**
	 * @param args
	 * @throws Throwable
	 */
	public static void main(String[] args) throws Throwable {
		/*create an object generic libraries class*/
		FileLib fLib=new FileLib();
		WebdriverCommonLib wLib=new WebdriverCommonLib();
		/* read data from external resource */
		String url=fLib.getPropertyKeyValue("url");
		String userName=fLib.getPropertyKeyValue("username");
		String password=fLib.getPropertyKeyValue("password");
		/* Step 1:login to app */
		WebDriver driver=new FirefoxDriver();
		wLib.waitForPageToLoad(driver);
		
		driver.get(url);
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		
		/*Navigate to user list for user creation*/
		driver.findElement(By.xpath("//a/div[text()='Users']")).click();
		driver.findElement(By.xpath("//span[text()='User']")).click();
		
		/*Create a user*/
		String FirstName=fLib.getExcelData("Sheet3", 2, 1);
		String MidName=fLib.getExcelData("Sheet3", 2, 2);
		String LastName=fLib.getExcelData("Sheet3", 2, 3);
		String USERNAME=fLib.getExcelData("Sheet3", 2, 0);
		String PASSWORD=fLib.getExcelData("Sheet3", 2, 4);
		String EMAILID=fLib.getExcelData("Sheet3", 2, 5);
		
		System.out.println(FirstName+LastName+MidName+USERNAME+PASSWORD+EMAILID);
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(FirstName);
		driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys(MidName);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(USERNAME);
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(LastName);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(EMAILID);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//input[@name='passwordCopy']")).sendKeys(PASSWORD);
		
		driver.findElement(By.xpath("//div[@id='userDataLightBox_commitBtn']")).click();
		/*verify user*/
		boolean flag=false;
		String x="//table[@class='userListTable hidePTO sortByName']/tbody/tr/td[1]";
        List<WebElement> lst=driver.findElements(By.xpath(x));
        
	    for(WebElement wb1:lst) 
	    {
	    	if(wb1.getText().contains("Das, Dipak Kumar")) 
	    	{
	    		//System.out.println(wb1.getText()+"is value");
	    		flag=true;
	    			
	    	if(flag==true) 
	    	{
	    		System.out.println(wb1.getText()+"is found==>Pass");
	    		
	    	}else 
	    	{
	    		System.out.println(wb1.getText()+"is not found==>Fail");
	    	}
	      }
	     }
	    
		
		/*Logout Application*/
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
	   }
	}

