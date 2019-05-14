package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;

public class AmazonTest {

	public static void main(String[] args) throws InterruptedException {
		//FirefoxDriver d=new FirefoxDriver();//to launch a empty browser
		ChromeDriver d=new ChromeDriver();	
				//d.get("https://amazon.in");//navigate to any web application
				
				d.navigate().to("https://amazon.in");//navigate to any web application
				
				FluentWait<WebDriver> wait=new FluentWait<WebDriver>(d)
						.pollingEvery(5,TimeUnit.SECONDS)
					    .withTimeout(60,TimeUnit.SECONDS)
						.ignoring(Throwable.class);
				
				WebElement dWb=d.findElement(By.xpath("(//span[@class='nav-line-2'])[2]"));
				dWb.click();
                d.findElement(By.id("ap_email")).sendKeys("dasdebalina3@gmail.com");
				
				d.findElement(By.id("continue")).click();
				
				d.findElement(By.id("ap_password")).sendKeys("Ddba72@@");
				
				d.findElement(By.id("signInSubmit")).click();
				
				
}}
