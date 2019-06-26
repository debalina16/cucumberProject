/**
 * 
 */
package Assignment;

import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Debalina
 *
 */
public class MapLocalhost {
public static void main(String[] args) {
HashMap<String,String> map=new HashMap();

    map.put("url", "http://localhost/login.do");
	map.put("os", "windows");
	map.put("username", "admin");
	map.put("pwd","manager");
	map.put("browser", "firefox");
	
WebDriver driver=new ChromeDriver();
driver.get(map.get("url"));
driver.findElement(By.name("username")).sendKeys(map.get("username"));
driver.findElement(By.name("pwd")).sendKeys(map.get("pwd"));
driver.findElement(By.id("loginButton")).click();

}
}
