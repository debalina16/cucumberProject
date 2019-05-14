package Pack7;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://www.randstad.in/my-randstad/register/");
	driver.findElement(By.id("ctl08_ctl04_CVFileUpload")).sendKeys("E:\\Imp Docs\\CV_Debalina_Das 3.4_years.docx");
}
}
