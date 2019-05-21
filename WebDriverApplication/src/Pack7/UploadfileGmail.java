package Pack7;

import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.sun.glass.events.KeyEvent;


public class UploadfileGmail {
public static void main(String[] args) throws Throwable {
	WebDriver d=new FirefoxDriver();
	d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//navigate to any web application
	d.get("https://gmail.com");
	
	//fetch Current Page Title	
	String currentPageTitle=d.getTitle();//capture current Page Title
	System.out.println(currentPageTitle);
	
	   //Provide username
	    WebElement emailWb=d.findElement(By.id("identifierId"));
	    emailWb.sendKeys("rendeb.lina");
	    //click on next button
	    WebElement btnwb=d.findElement(By.xpath("//span[@class='RveJvd snByac']"));
	    btnwb.click();
	    
	    //give password and click next to login
	    WebDriverWait wb=new WebDriverWait(d, 30);
	    wb.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
	    WebElement passwd=d.findElement(By.name("password"));
	    passwd.sendKeys("Ddba72@@");
	    WebElement btnwb1=d.findElement(By.xpath("//span[text()='Next']"));
	    btnwb1.click();
	    
	    
	    //click on compose button
	    d.findElement(By.xpath("//div[text()='Compose']")).click();
	    
	    //click on attach button
	    d.findElement(By.xpath("//div[@aria-label='Attach files']/div/div")).click();
	    
	    //copy the file path
	    StringSelection str=new StringSelection("E:\\Imp Docs\\CV_Debalina_Das 3.4_years.docx");
	    
	    //get toolkit object
	    java.awt.Toolkit tool=java.awt.Toolkit.getDefaultToolkit();
	    //get Clipboard object
	    java.awt.datatransfer.Clipboard mouse=tool.getSystemClipboard();
	    //copy the content in to mouse tool
	    mouse.setContents(str, null);
	   
	    //paste the file path
	    Robot robot=new Robot(); 
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    

   }
}
