package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartTest {
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("https://flipkart.com");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_2zrpKA']")).sendKeys("dasdebalina3@gmail.com");
		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv']")).sendKeys("Ddba72@@");
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("samsung mobiles");
		driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='_2aUbKa']")).click();
		
	}

}
