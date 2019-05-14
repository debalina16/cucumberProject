package pack5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectFromMenu {//
	public static void main(String[] args) {
	//navigate to flipkart.com
			WebDriver driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.flipkart.com/");
			
			//close the popup for login
			driver.findElement(By.xpath("//button[text()='✕']")).click();
			
			WebElement wb=driver.findElement(By.xpath("//span[text()='TVs & Appliances']"));
			Actions act=new Actions(driver);
            act.moveToElement(wb).perform();
            
            String x="//a[@title='LG' and contains(@href,'air-conditioners')]";
            WebDriverWait wait=new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(x)));
            driver.findElement(By.xpath(x)).click();
			
}}
