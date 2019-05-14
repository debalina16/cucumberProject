package pack6;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiAddToCartTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		//close the popup for login
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.findElement(By.name("q")).sendKeys("IPhone",Keys.ENTER);
		
		 Thread.sleep(5000);
		 String parentID=driver.getWindowHandle();
		 
		driver.findElement(By.xpath("//div[text()='Apple iPhone 7 (Rose Gold, 32 GB)']")).click();
		driver.findElement(By.xpath("//div[text()='Apple iPhone 6s (Space Grey, 32 GB)']")).click();
		driver.findElement(By.xpath("//div[text()='Apple iPhone 6s (Rose Gold, 32 GB)']")).click();
		
		Thread.sleep(5000);
		
		String expPage="iPhone 7 : Buy Apple iPhone 7 (Rose Gold, 32 GB)";
		Set<String> set=driver.getWindowHandles();
		Iterator<String> it=set.iterator();
		
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			String actPage=driver.getTitle();
			if(actPage.contains(expPage)) {
				driver.findElement(By.xpath("//button[text()='BUY NOW']")).click();
				break;
			}
			
		}
		driver.switchTo().window(parentID);
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("Nokia",Keys.ENTER);
	}				
}
