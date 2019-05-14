package pack3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookDropDownTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver wb=new FirefoxDriver();
		wb.get("https://facebook.com/");
		
		wb.findElement(By.id("u_0_j")).sendKeys("Debalina");
		wb.findElement(By.id("u_0_l")).sendKeys("Das");
		
		wb.findElement(By.id("u_0_o")).sendKeys("dasdebalina3@gmail.com");
		wb.findElement(By.id("u_0_r")).sendKeys("dasdebalina3@gmail.com");
		wb.findElement(By.id("u_0_v")).sendKeys("Ddba72@@");
		
		WebElement dwb=wb.findElement(By.id("day"));
        org.openqa.selenium.support.ui.Select sel=new org.openqa.selenium.support.ui.Select(dwb);
		sel.selectByVisibleText("16");
		
		WebElement mwb=wb.findElement(By.id("month"));
        org.openqa.selenium.support.ui.Select sel1=new org.openqa.selenium.support.ui.Select(mwb);
		sel1.selectByVisibleText("Oct");
		
		WebElement ywb=wb.findElement(By.id("year"));
        org.openqa.selenium.support.ui.Select sel2=new org.openqa.selenium.support.ui.Select(ywb);
		sel2.selectByVisibleText("1991");
		
		wb.findElement(By.id("u_0_9")).click();
		
		wb.findElement(By.id("u_0_11")).click();
		
		
		
		
}
}
