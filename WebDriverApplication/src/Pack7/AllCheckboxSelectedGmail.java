package Pack7;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllCheckboxSelectedGmail {

	public static void main(String[] args) {
		WebDriver d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//navigate to any web application
		d.get("https://gmail.com");
		
		//fetch Current Page Title	
		String currentPageTitle=d.getTitle();//capture current Page Title
		System.out.println(currentPageTitle);
		
		   //Provide username
		    WebElement emailWb=d.findElement(By.id("identifierId"));
		    emailWb.sendKeys("rendeb.lina");
		    //click on next button
		    WebElement btnwb=d.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		    btnwb.click();
		    
		    //give password and click next to login
		    WebDriverWait wb=new WebDriverWait(d, 30);
		    wb.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		    WebElement passwd=d.findElement(By.name("password"));
		    passwd.sendKeys("Ddba72@@");
		    WebElement btnwb1=d.findElement(By.xpath("//span[text()='Next']"));
		    btnwb1.click();
		    
		   /* //identify all the checkbox inside the inbox webtable
		    String x="//table[@class='F cf zt']/tbody/tr[*]/td[2]/*";
		    List<WebElement> lst=d.findElements(By.xpath(x));
		    //click all the links
		    for(WebElement wbe:lst) {
		    	wbe.click();
		    }
		    */
		    
		   /* //indentify all the msg subject inside the inbox webtable and display in the console
		    String y="//table[@class='F cf zt']/tbody/tr[*]/td[6]/*";
		    
		    List<WebElement> lst=d.findElements(By.xpath(y));
		    //click all the links
		    for(WebElement wbe:lst) {
		    	System.out.println("==>"+wbe.getText());
		    }*/
		    
		    String x="//table[@class='F cf zt']/tbody/tr[*]/td[2]/*";
		    List<WebElement> lst=d.findElements(By.xpath(x));
		    System.out.println("Mail Count==>"+lst.size());
		    
		    /*//click 1st 5 elements
		    int count=lst.size();
		    
		    for(int i=0;i<5;i++) {
		         lst.get(i).click();
		    }*/
		    
		    //click last 5 elements
            int count=lst.size();
		    
		    for(int i=count-1;i>count-6;i--) {
		         lst.get(i).click();
		    
		    }
		    
		    /*//click all links
		    for(WebElement wbe:lst) {
		    	wbe.click();
		    }*/
		    
		    WebDriverWait logout=new WebDriverWait(d, 30);
		    logout.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='gb_ya gbii']")));
		    WebElement imgWb=d.findElement(By.xpath("//span[@class='gb_ya gbii']"));
		    imgWb.click();
		    
		   // Thread.sleep(1000);
		    
		    WebElement logoutWb=d.findElement(By.id("gb_71"));
		    logoutWb.click();
		    
		    d.quit();

		}

	}