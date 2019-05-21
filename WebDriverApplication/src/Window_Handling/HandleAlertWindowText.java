package Window_Handling;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HandleAlertWindowText {
	public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.jquery-az.com/javascript/demo.php?ex=151.1_1");
	
	driver.findElement(By.xpath("//button[text()='Click here to show confirm alert']")).click();
	
	org.openqa.selenium.Alert alt=driver.switchTo().alert();
	System.out.println(alt.getText());
	alt.accept();
	alt.accept();
	}
}
