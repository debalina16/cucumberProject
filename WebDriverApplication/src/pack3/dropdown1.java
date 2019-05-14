package pack3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///E:/HTML/dropdown.html");
		WebElement wb=driver.findElement(By.xpath("//select[@multiple='true']"));
		Select sc=new Select(wb);
		if(sc.isMultiple()) {
			
				System.out.println("It is Multi Select Dropdown");
				
				int count=sc.getOptions().size();
				
				for(int i=0;i<count;i++) {
					sc.selectByIndex(i);
				}
		}else {
			    System.out.println("It is Multi Select Dropdown");
		}
		sc.deselectAll();
}}
