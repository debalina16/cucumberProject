package pack3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActimecopyPaste {
	public static void main(String[] args){
		WebDriver wb=new FirefoxDriver();
		wb.get("http://localhost/login.do");
		
		WebElement w=wb.findElement(By.name("username"));
		
		w.sendKeys("admin");
		Actions act=new Actions(wb);
		
		act.doubleClick().perform();
		act.sendKeys(Keys.chord(Keys.CONTROL,"c")).perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.chord(Keys.CONTROL,"v")).perform();
		
		
		
	}}		
