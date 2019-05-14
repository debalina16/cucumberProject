package pack5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoProductCount {

	public static void main(String[] args) {
		//navigate to flipkart.com
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		//close the popup for login
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		//search for apple
		driver.findElement(By.name("q")).sendKeys("apple",Keys.ENTER);
		String result=driver.findElement(By.xpath("//span[contains(text(),'Showing')]")).getText();
		String[] arr=result.split(" ");
		String stringcount=arr[5];
		System.out.println("count"+stringcount);
		int count=Integer.parseInt(stringcount.replaceAll(",", ""));
		//int count=Integer.parseInt(stringcount);
		System.out.println(count-5);
		
		

	}

}
