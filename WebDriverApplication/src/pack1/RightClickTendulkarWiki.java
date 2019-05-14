package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickTendulkarWiki {
public static void main(String[] args) throws InterruptedException {
	WebDriver d=new FirefoxDriver();
	d.get("https://google.com");
	d.findElement(By.name("q")).sendKeys("Tendulkar",Keys.ENTER);
	
	Thread.sleep(3000);
	
	WebElement wb=d.findElement(By.xpath("(//h3[text()='Sachin Tendulkar - Wikipedia'])[1]"));
	//wb.click();
	Actions act=new Actions(d);
	act.contextClick(wb).perform();
	act.sendKeys("T").perform();
}
}
