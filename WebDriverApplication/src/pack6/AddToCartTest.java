package pack6;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddToCartTest {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com/");
	
	//close the popup for login
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	
	driver.findElement(By.name("q")).sendKeys("IPhone",Keys.ENTER);
	
	 Thread.sleep(5000);
	 
	driver.findElement(By.xpath("//div[text()='Apple iPhone 6s (Space Grey, 32 GB)']")).click();
	
	Set<String> set=driver.getWindowHandles();
	
    Iterator<String> it=set.iterator();
	
    String parentID=it.next();
    
    String childID=it.next();
    
    driver.switchTo().window(childID);
    
    Thread.sleep(5000);
    
    driver.findElement(By.xpath("//button[text()='BUY NOW']")).click();
    
    driver.switchTo().window(parentID);
    
    
	
}
}
