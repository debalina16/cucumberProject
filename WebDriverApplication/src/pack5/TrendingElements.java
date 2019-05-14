package pack5;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TrendingElements {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://in.yahoo.com");
		
		String parentID=driver.getWindowHandle();
		
		String x="//span[@data-category='trending news']/../../ul/li/ul/li[*]";
		
		java.util.List<WebElement> lst=driver.findElements(By.xpath(x));
		
		Set<String> set=driver.getWindowHandles();
		Iterator<String> it=set.iterator();
		
		/*for(WebElement wb:lst) {
			System.out.println(wb.getText());
		}
		*/
		/*for(WebElement wb:lst) {
			wb.click();
			String titlePage=driver.getTitle();
			Thread.sleep(4000);
			//driver.switchTo().window(parentID);
			driver.navigate().back();
		}*/
		
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			String actPage=driver.getTitle();
			if(actPage.contains("Not Found")) {
				System.out.println("Link is Broken==>"+driver.getTitle());
				break;
			}
			driver.switchTo().window(parentID);
			
		}
}}
