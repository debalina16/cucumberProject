package DataDriven;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CustomerTest {
	public static void main(String[] args) throws Throwable {
		/*get the java object from that  physical file */
		FileInputStream fis=new FileInputStream(".\\Data\\commonData.properties");
		/*using properties file read and load all the data into properties object*/
		Properties pobj=new Properties();
		pobj.load(fis);
		/*read the data using key*/
		String URL=pobj.getProperty("url");
		String USER=pobj.getProperty("username");
		String PASSWORD=pobj.getProperty("password");
		String BROWSER=pobj.getProperty("browser");
		
		/*System.out.println(URL);
		System.out.println(USER);
		System.out.println(PASSWORD);
		System.out.println(BROWSER);*/
		
		/*launch the browser*/
		WebDriver driver=null;
		if(BROWSER.equals("firefox")) {
			driver=new FirefoxDriver();	
		}else if(BROWSER.equals("chrome")) {
			driver=new ChromeDriver();
		}else if(BROWSER.equals("ie")) {
			driver=new InternetExplorerDriver();
		}
		driver.get(URL);
		Thread.sleep(2000);
		/*login into app*/
		driver.findElement(By.id("username")).sendKeys(USER);
		driver.findElement(By.name("pwd")).sendKeys(PASSWORD);
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
	}

}
