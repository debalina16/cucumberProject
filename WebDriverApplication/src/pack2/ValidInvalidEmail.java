package pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidInvalidEmail {
	
	public static void main(String[] args) throws Exception  {
	
		WebDriver d= new FirefoxDriver();
		d.get("https://gmail.com");
		
		String expPage="Gmail";
		String actTitle=d.getTitle();
		if(expPage.equals(actTitle)) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		d.findElement(By.id("identifierId")).sendKeys("gh");
		
		d.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(1000);
		
		String expMsg="Couldn't find your Google Account";
		
		WebElement wb=d.findElement(By.xpath("//div[@class='GQ8Pzc']"));
		
		String actMsg=wb.getText();
		
		System.out.println(actMsg);
		//System.out.println(actMsg);
		
		if(expMsg.equals(actMsg)) {
			System.out.println("Displayed Error Message==>Pass");
		}else {
			System.out.println("Not displayed Error Message==>Fail");
		}	
		
		String actColor=wb.getCssValue("color");
		
		System.out.println(actColor);
		
		
	}

}
