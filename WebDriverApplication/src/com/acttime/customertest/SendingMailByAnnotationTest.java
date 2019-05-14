/**
 * 
 */
package com.acttime.customertest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import com.actitime.genericlib.FileLib;
import com.actitime.genericlib.WebdriverCommonLib;

/**
 * @author Debalina
 *
 */
public class SendingMailByAnnotationTest {
	@Test
	public void mailSendTest()throws Throwable {
	    /*created instance of FileLib andWebdriverCommounLib*/
		FileLib flib=new FileLib();
		WebdriverCommonLib wLib=new WebdriverCommonLib();
		/*fetch data from properties file*/
		String URL=flib.getPropertyKeyValue("urlForGmail");
		String USERNAME=flib.getPropertyKeyValue("userNameForGmail");
		String PASSWORD=flib.getPropertyKeyValue("passwordForGmail");
		String BROWSER=flib.getPropertyKeyValue("browser");
		/*Browser Selection*/
		WebDriver d=null;
		if(BROWSER.equals("firefox")) {
			d=new FirefoxDriver();	
		}else if(BROWSER.equals("chrome")) {
			d=new ChromeDriver();
		}else if(BROWSER.equals("ie")) {
			d=new InternetExplorerDriver();
		}
		/*Launch Browser*/
		wLib.waitForPageToLoad(d);
		d.get(URL);
		
		System.out.println("======Start=====");
		/*Loging the app*/
		d.findElement(By.id("identifierId")).sendKeys(USERNAME);
	    
	    d.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	    
	    WebElement passwd=d.findElement(By.name("password"));
	    wLib.waitForElementPresent(d, passwd);
	    passwd.sendKeys(PASSWORD);
	    
	    WebElement btnwb1=d.findElement(By.xpath("//span[text()='Next']"));
	    btnwb1.click();
	    /*click on compose*/
	    WebElement composeclick=d.findElement(By.xpath("//div[text()='Compose']"));
	    //wLib.waitForElementPresent(d, composeclick);
	    composeclick.click();
	    
	    /*fetch data from excel*/
	    String EMAILID=flib.getExcelData("Sheet4", 1, 0);
	    String CC=flib.getExcelData("Sheet4", 1, 1);
	    String SUBJECT=flib.getExcelData("Sheet4", 1, 2);
	    String BODY=flib.getExcelData("Sheet4", 1, 3);
	    
	    /*Enter Recipient*/
	    wLib.waitForPageToLoad(d);
	    WebElement wb=d.findElement(By.xpath("//textarea[@name='to']"));
	    wLib.waitForFluentElementPresent(d, wb);
	    wb.sendKeys(EMAILID);
	    Actions act=new Actions(d);
	    act.sendKeys(Keys.TAB).perform();
	        
	    /*d.findElement(By.xpath("//span[@id=':fv']")).click();
	    WebElement wb1=d.findElement(By.xpath(" //textarea[@name='cc']"));
	    wb1.sendKeys(CC);
	    Actions act1=new Actions(d);
	    act1.sendKeys(Keys.ENTER).perform();
	    */
	    
	    /*Enter Subject*/
	    d.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys(SUBJECT);
	    
	    /*Enter Body*/
	    d.findElement(By.xpath("//div[@class='Am Al editable LW-avf']")).sendKeys(BODY);
	    
	    /*click on send key*/
	    d.findElement(By.xpath("//div[@class='dC']")).click();
	    
	   // Thread.sleep(5000);
	    
	   /* WebElement imgWb=d.findElement(By.xpath("//span[@class='gb_ya gbii']"));
	    wLib.waitForElementPresent(d, imgWb);

	    imgWb.click();
	    WebElement logoutWb=d.findElement(By.id("gb_71"));
	    logoutWb.click();
	    
	    d.quit();*/
	    
	    System.out.println("======Exit======");
	}

}
