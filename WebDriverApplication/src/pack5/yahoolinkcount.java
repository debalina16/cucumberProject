package pack5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class yahoolinkcount {
	public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://in.yahoo.com");
	
	java.util.List<WebElement> lst=driver.findElements(By.xpath("//a"));
	System.out.println(lst.size());
	
	/*for(WebElement wb:lst) {
		System.out.println(wb.getText());
	}*/
	
	for(int i=0;i<lst.size();i++) {
		String lnkname=lst.get(i).getText();
		System.out.println(lnkname);
	}
}}
