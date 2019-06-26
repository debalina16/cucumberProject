/**
 * 
 */
package Assignment;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.genericlib.WebdriverCommonLib;

/**
 * @author Debalina
 *
 */
public class MapLocalhost1 {
public static void main(String[] args) {
	WebdriverCommonLib lib=new WebdriverCommonLib();
	HashMap<String,String> map=lib.contants();
	WebDriver driver=new ChromeDriver();
	driver.get(map.get("url"));
	driver.findElement(By.name("username")).sendKeys(map.get("username"));
	driver.findElement(By.name("pwd")).sendKeys(map.get("pwd"));
	driver.findElement(By.id("loginButton")).click();
}
}
