package Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Debalina
 *
 */
public class DynamicWebElement {
	public static void main(String[] args) throws InterruptedException {
    WebDriver d=new FirefoxDriver();//to launch a empty browser
	d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	d.get("https://gmail.com");//navigate to any web application
		
	WebElement emailWb=d.findElement(By.id("identifierId"));
	emailWb.sendKeys("rendeb.lina");
	    
	    WebElement btnwb=d.findElement(By.xpath("//span[@class='RveJvd snByac']"));
	    btnwb.click();
	    
	    Thread.sleep(2000);
	    WebDriverWait wait=new WebDriverWait(d, 30);
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
	    WebElement passwd=d.findElement(By.name("password"));
	    passwd.sendKeys("Ddba72@@");
	    
	    d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    WebElement btnwb1=d.findElement(By.xpath("//span[text()='Next']"));
	    btnwb1.click();
	   
	    String x="//table[@class='F cf zt']/tbody/tr[*]/td[6]/*";
	    
	    List<WebElement> lst=d.findElements(By.xpath(x));
	    
	    for(WebElement wb1:lst) {
	    	if(wb1.getText().contains("Ravinder Singh")) {
	    		System.out.println(wb1.getText());
	    		//break;
	    	}
	    }
	    
	    /*WebElement imgWb=d.findElement(By.xpath("//span[@class='gb_ya gbii']"));
	    imgWb.click();

	    WebElement logoutWb=d.findElement(By.id("gb_71"));
	    logoutWb.click();
	    */
	    
}}
