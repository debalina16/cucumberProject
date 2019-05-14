package pack3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleZoomMap {
public static void main(String[] args) throws InterruptedException {
	WebDriver wb=new FirefoxDriver();
	wb.get("https://www.google.com/");
	wb.findElement(By.name("q")).sendKeys("Michael Clarke",Keys.ENTER);
	Thread.sleep(1000);
	wb.findElement(By.xpath("//a[text()='Maps']")).click();
	
	Actions act=new Actions(wb);
    act.sendKeys(Keys.chord(Keys.CONTROL,Keys.ADD)).perform();
    act.sendKeys(Keys.chord(Keys.CONTROL,Keys.ADD)).perform();
}
}
