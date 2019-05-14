package pack3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class amazon1 {
public static void main(String[] args) throws InterruptedException {
		WebDriver wb=new FirefoxDriver();
		wb.get("https://www.amazon.com/");
		WebElement w=wb.findElement(By.xpath("//span[text()='Departments']"));
		Actions act=new Actions(wb);
		act.moveToElement(w).perform();
		Thread.sleep(1000);
		wb.findElement(By.xpath("//span[text()='Computers']")).click();
		
		
		
}}
