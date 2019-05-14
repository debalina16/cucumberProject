package pack5;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BookAllFlightsMulti {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
	
		driver.findElement(By.xpath("//input[@value='RoundTrip']")).click();
		
        driver.findElement(By.id("FromTag")).sendKeys("ccu",Keys.TAB);
		
		driver.findElement(By.id("ToTag")).sendKeys("blr",Keys.TAB);
		
		
		String x="//td[@data-month='3']/a[@class='ui-state-default ' and text()='30']";
		driver.findElement(By.xpath(x)).click();
		
		String y="//td[@data-month='4']/a[@class='ui-state-default ' and text()='15']";
		driver.findElement(By.xpath(y)).click();
		
		WebElement wb=driver.findElement(By.xpath("//select[@name='adults']"));
		Select sl=new Select(wb);
	    sl.selectByVisibleText("4");
		
	    driver.findElement(By.xpath("//input[@class='booking large']")).click();
  }
}	
	
