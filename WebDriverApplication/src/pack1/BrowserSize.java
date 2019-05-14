package pack1;

import java.awt.Dimension;

import org.openqa.selenium.Point;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSize {
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://gmail.com");
		
		org.openqa.selenium.Dimension d1=new org.openqa.selenium.Dimension(300, 300);
		driver.manage().window().setSize(d1);
		
		driver.manage().window().maximize();
		
		Point p1=new Point(400, 100);
		driver.manage().window().setPosition(p1);
		
		//driver.close();
		driver.quit();
	}

}
