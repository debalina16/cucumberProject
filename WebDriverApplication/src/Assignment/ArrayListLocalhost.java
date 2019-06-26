/**
 * 
 */
package Assignment;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Debalina
 *
 */
public class ArrayListLocalhost {
public static void main(String[] args) {
	ArrayList<String> a1=new ArrayList();
	a1.add("http://localhost/login.do");
	a1.add("firefox");
	a1.add("windows");
	a1.add("admin");
	a1.add("manager");
	a1.add("browser");
	
	WebDriver driver=new ChromeDriver();
	driver.get(a1.get(0));
	driver.findElement(By.name("username")).sendKeys(a1.get(3));
	driver.findElement(By.name("pwd")).sendKeys(a1.get(4));
	driver.findElement(By.id("loginButton")).click();
	
}
}
