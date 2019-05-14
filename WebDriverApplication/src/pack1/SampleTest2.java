package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleTest2 {
	public static void main(String[] args) throws InterruptedException {
    FirefoxDriver d=new FirefoxDriver();//to launch a empty browser
		
		d.get("https://gmail.com");//navigate to any web application
		
		String currentPageTitle=d.getTitle();//capture current Page Title
		System.out.println(currentPageTitle);
		
		System.out.println("======Start=====");
		
		WebElement emailWb=d.findElement(By.id("identifierId"));
	    emailWb.sendKeys("debalina.ibm");
	    
	    WebElement btnwb=d.findElement(By.xpath("//span[@class='RveJvd snByac']"));
	    btnwb.click();
	    
	    Thread.sleep(2000);
	    
	    WebElement passwd=d.findElement(By.name("password"));
	    passwd.sendKeys("Ddba72@@");
	    
	    WebElement btnwb1=d.findElement(By.xpath("//span[text()='Next']"));
	    btnwb1.click();
	    
	    
	    Thread.sleep(6000);
	    
	    WebElement imgWb=d.findElement(By.xpath("//span[@class='gb_ya gbii']"));
	    imgWb.click();
	    
	    Thread.sleep(1000);
	    
	    WebElement logoutWb=d.findElement(By.id("gb_71"));
	    logoutWb.click();
	    
	    d.quit();
	    System.out.println("======Exit======");
	}

}
