
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 */

/**
 * @author Debalina
 *
 */
public class DynamicWebtable {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new FirefoxDriver();
	driver.navigate().to("https://www.gmail.com");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.findElement(By.id("identifierId")).sendKeys("dasdebalina16@gmail.com");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("Ddba72@@");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	
	String x="//table[@class='F cf zt']/tbody/tr[*]/td[5]/*";
	List<WebElement> lst=driver.findElements(By.xpath(x));
	System.out.println(lst.size());
	for(WebElement wb:lst) {
		System.out.println(wb.getText());
	}
	String y="//table[@class='F cf zt']/tbody/tr[*]/td[2]/*";
	List<WebElement> lst1=driver.findElements(By.xpath(y));
	
	for(int i=lst1.size()-1;i>=lst1.size()-5;i--) {
		lst1.get(i).click();
	  
	}
	
}
}
