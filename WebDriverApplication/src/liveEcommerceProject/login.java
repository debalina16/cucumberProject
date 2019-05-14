/**
 * 
 */
package liveEcommerceProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Debalina
 *
 */
public class login {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr194331");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ydUzEdY");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	}

}
