package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonAssignment2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		WebElement wb=driver.findElement(By.xpath("//span[text()='Category']"));
		Actions act=new Actions(driver);
        act.moveToElement(wb).perform();
        
        String x="//span[text()='Mobiles, Computers']";
        WebDriverWait wait=new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(x)));
        driver.findElement(By.xpath(x)).click();
        
        String y="//span[text()='All Mobile Phones']";
        WebDriverWait wait1=new WebDriverWait(driver, 30);
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(y)));
        driver.findElement(By.xpath(y)).click();
        
        
        String z="//input[@type='checkbox' and @name='s-ref-checkbox-Samsung']";
        WebDriverWait wait2=new WebDriverWait(driver, 30);
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(z)));
        driver.findElement(By.xpath(z)).click();
        
        
        String a=
"//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox']/label/span[@class='a-label a-checkbox-label']/span[@class='a-size-base a-color-base'and text()='Redmi']";
        WebDriverWait wait3=new WebDriverWait(driver, 40);
        wait3.until(ExpectedConditions.presenceOfElementLocated(By.xpath(a)));
        driver.findElement(By.xpath(a)).click();
        
      String count="//div[@class='sg-col-inner']/div[@class='a-section a-spacing-small a-spacing-top-small']/span[1]";
      String data=driver.findElement(By.xpath(count)).getText();
      System.out.println(data);
      String[] point=data.split(" ");
      System.out.println(point[3]);
        
     
}}

