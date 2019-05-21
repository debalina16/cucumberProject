package Window_Handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameWindowTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//navigate to seleniumhq website and goto javadoc
		driver.get("https://www.seleniumhq.org/");
		driver.findElement(By.xpath("//a[@title='Get Selenium']")).click();
	    driver.findElement(By.xpath("//a[@alt='Javadoc']")).click();
	    
		//switch to frame2
		driver.switchTo().frame("classFrame");
		
		//click on com.thoughtworks.selenium
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		
		driver.navigate().back();
	     //navigate to main window
		driver.switchTo().defaultContent();
		
		
		Thread.sleep(2000);
		//goto frame3
        driver.switchTo().frame("packageFrame");
		//click on Actions
		driver.findElement(By.linkText("Actions")).click();
		
	}
}
