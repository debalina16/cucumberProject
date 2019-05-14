package pack4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmailWait {
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver d=new FirefoxDriver();//to launch a empty browser
				d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//d.get("https://amazon.in");//navigate to any web application
				
				d.navigate().to("https://amazon.in");//navigate to any web application
				
				String currentPageTitle1=d.getTitle();//capture current Page Title
				System.out.println(currentPageTitle1);
				
				int count=d.findElements(By.tagName("a")).size();
				System.out.println(count);
				
				d.findElement(By.linkText("Today's Deals")).click();
				d.navigate().back();
				
				d.navigate().forward();
				
				d.navigate().refresh();
				
				d.findElement(By.linkText("Your Amazon.in")).click();
				
				d.findElement(By.id("ap_email")).sendKeys("dasdebalina3@gmail.com");
				
				d.findElement(By.id("continue")).click();
				
				d.findElement(By.id("ap_password")).sendKeys("Ddba72@@");
				
				d.findElement(By.id("signInSubmit")).click();
				
				String currentPageTitle=d.getTitle();//capture current Page Title
				System.out.println(currentPageTitle);
				
				d.findElement(By.id("twotabsearchtextbox")).sendKeys("kindle");
				
				d.findElement(By.xpath("//input[@class='nav-input']")).click();
				
				d.findElement(By.linkText("Kindle (8th Gen), 6\" Display, 4 GB, Wi-Fi (White)")).click();
				
				
				
				//d.findElement(By.id("add-to-cart-button")).click();
				
}}
