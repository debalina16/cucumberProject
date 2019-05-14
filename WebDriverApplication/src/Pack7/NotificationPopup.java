package Pack7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class NotificationPopup {
public static void main(String[] args) throws InterruptedException {
	    FirefoxProfile profile=new FirefoxProfile();
	    profile.setPreference("dom.webnotifications.serviceworker.enabled", false);
	    profile.setPreference("dom.push.enabled", false);
	    
	    DesiredCapabilities capabilities=DesiredCapabilities.firefox();
	    capabilities.setCapability(FirefoxDriver.PROFILE,profile);
	
		WebDriver driver=new FirefoxDriver(capabilities);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dasdebalina3@gmail.com");
	    driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Ddba72@@");
	    driver.findElement(By.xpath("//input[@aria-label='Log In']")).click();

	    driver.findElement(By.xpath("//div[@id='userNavigationLabel']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[text()='Log Out']")).click();
		driver.close();
	  
	  
	
}
}
