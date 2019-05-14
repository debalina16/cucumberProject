package pack3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///E:/HTML/dropdown.html");
		String expVal="Testing";
		boolean flag=false;
		WebElement wb=driver.findElement(By.xpath("//select[@multiple='true']"));
		Select sc=new Select(wb);
		if(sc.isMultiple()) {
			
				System.out.println("It is Multi Select Dropdown");
				
			List<WebElement> lst=sc.getOptions();
				
				for(int i=0;i<lst.size();i++) {
				     String actval= lst.get(i).getText();
				     
				     if(actval.contains(expVal)) {
				    	 sc.selectByVisibleText(actval);
				    	 flag=true;
				     }
				}
		if(flag==true) {
			System.out.println(expVal+" ==>is available==>Pass");
		}else {
			System.out.println(expVal+" ==>is not available==>Fail");
		}
}}}
