package Window_Handling;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class solid {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("IPhone XR",Keys.ENTER);
		String x="//div[text()='Apple iPhone XR (Blue, 256 GB)']/../../div[2]/div[1]/div/div[1]";
		String price=driver.findElement(By.xpath(x)).getText();
		System.out.println(price);
	}

}
