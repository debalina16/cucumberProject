package pack5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TrendingElementsList {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://in.yahoo.com");
		
		String parentID=driver.getWindowHandle();
		
		String x="//span[@data-category='trending news']/../../ul/li/ul/li[*]";
		
		java.util.List<WebElement> lst=driver.findElements(By.xpath(x));
		
		for(WebElement wb:lst) {
			System.out.println(wb.getText());
		}
}}
