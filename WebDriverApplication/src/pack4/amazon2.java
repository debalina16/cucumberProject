package pack4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class amazon2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver wb=new FirefoxDriver();
		wb.get("https://www.amazon.in/");
		
		WebDriverWait wait=new WebDriverWait(wb, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@alt='Up to 25% off : helmets']")));
		wb.findElement(By.xpath("//img[@alt='Up to 25% off : helmets']")).click();
}}
