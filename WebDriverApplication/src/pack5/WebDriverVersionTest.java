package pack5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverVersionTest {
	public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.seleniumhq.org/download/");
	String version=driver.findElement(By.xpath("//td[text()='Java']/following-sibling::td[1]")).getText();
	System.out.println(version);
	
	String versionDate=driver.findElement(By.xpath("//td[text()='Java']/following-sibling::td[2]")).getText();
	System.out.println(versionDate);
	
}}
