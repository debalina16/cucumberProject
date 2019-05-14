package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonAssignment1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		String x="//input[@name='field-keywords']";
		/*driver.findElement(By.xpath(x)).sendKeys("Iphone XR",Keys.ENTER);
		
		String y="//a[contains(@href,'Apple-iPhone-XR-256GB-Yellow')]/span/span[2]/span[2]";
		
		String price=driver.findElement(By.xpath(y)).getText();
		
		System.out.println(price);*/
		
		driver.findElement(By.xpath(x)).sendKeys("Iphone XS",Keys.ENTER);
		String z="//a[contains(@href,'Apple-iPhone-Xs-256GB-Space')]/span/span[2]/span[2]";
        String price=driver.findElement(By.xpath(z)).getText();
		System.out.println(price);
		
		
	}
}
