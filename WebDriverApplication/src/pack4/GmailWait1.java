package pack4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class GmailWait1 {
	public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://gmail.com/");
	driver.findElement(By.xpath("(//span[@class='nav-line-2'])[2]")).click();
	
	FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver)
	.pollingEvery(5,TimeUnit.SECONDS)
    .withTimeout(60,TimeUnit.SECONDS)
	.ignoring(Throwable.class);
	
	//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//span[@class='nav-line-2'])[2]")));
	
    driver.findElement(By.xpath("(//span[@class='nav-line-2'])[2]")).click();
    
    driver.findElement(By.id("ap_email")).sendKeys("dasdebalina3@gmail.com");
	
	driver.findElement(By.id("continue")).click();
	
	driver.findElement(By.id("ap_password")).sendKeys("Ddba72@@");
	
	driver.findElement(By.id("signInSubmit")).click();
	
	
	
}}
