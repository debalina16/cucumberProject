package pack4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonTraverse {
	public static void main(String[] args) throws InterruptedException{
		
		WebDriver d=new FirefoxDriver();//to launch a empty browser
		
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		d.navigate().to("https://amazon.in");//navigate to any web application
		
		WebDriverWait wait=new WebDriverWait(d,30);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='nav-icon nav-arrow']/..[(text()='Account & Lists')]")));

		WebElement wb=d.findElement(By.xpath("//span[@class='nav-icon nav-arrow']/..[(text()='Account & Lists')]"));
		
		Actions act=new Actions(d);
		
		act.moveToElement(wb).perform();
		Thread.sleep(2000);
	    WebElement wb1=d.findElement(By.xpath("//span[@class='nav-action-inner']"));
				
		act.click(wb1).perform();
		
		//d.findElement(By.linkText("Your Amazon.in")).click();
				
		d.findElement(By.id("ap_email")).sendKeys("dasdebalina3@gmail.com");
				
		d.findElement(By.id("continue")).click();
				
		d.findElement(By.id("ap_password")).sendKeys("Ddba72@@");
				
		d.findElement(By.id("signInSubmit")).click();
	
	    d.findElement(By.id("twotabsearchtextbox")).sendKeys("kindle");
	
	    d.findElement(By.xpath("//input[@class='nav-input']")).click();
	
	
	    d.findElement(By.linkText("All-New Kindle (10th Gen), 6\" Display now with Built-in Light, 4 GB, Wi-Fi (Black)")).click();
	


	   // Thread.sleep(5000);
        //d.findElement(By.xpath("//span[@class='unified-price a-color-secondary']/span[@class='a-size-mini twisterSwatchPrice']")).click();
	
	
	Thread.sleep(2000);
    WebElement wb3=d.findElement(By.xpath("//span[@class='nav-icon nav-arrow']/..[(text()='Account & Lists')]"));
	
	Actions act1=new Actions(d);
	
	act1.moveToElement(wb3).perform();
	Thread.sleep(3000);
	
	d.findElement(By.xpath("//a[@id='nav-item-signout']/span[text()='Sign Out']")).click();
	
	d.close();
}
}