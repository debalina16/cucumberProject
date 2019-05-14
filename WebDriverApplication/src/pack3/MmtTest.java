package pack3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MmtTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver wb=new FirefoxDriver();
		wb.get("https://www.makemytrip.com/");
	
		WebElement From=wb.findElement(By.xpath("(//span[@class='truncate airPortName'])[1]"));
		Actions act1=new Actions(wb);
		act1.click(From).sendKeys("CCU").perform();
		wb.findElement(By.xpath("(//P[@class='font16 appendBottom8'])[1]")).click();
		act1.sendKeys(Keys.ESCAPE);
		
		WebElement To=wb.findElement(By.xpath("(//span[@class='truncate airPortName'])[2]"));
		Actions act2=new Actions(wb);
		act2.click(To).sendKeys("DEL").perform();
		wb.findElement(By.xpath("(//P[@class='font16 appendBottom8'])[1]")).click();
		act2.sendKeys(Keys.ESCAPE);
		
		//wb.findElement(By.xpath("(//span[@class='font30 latoBlack '])[1]")).click();
		
		
		
		
				
		
}}
