/**
 * 
 */
package DataDriven;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @author Debalina
 *
 */
public class ReadDataFromProperties {

	/**
	 * @param args
	 * @throws Throwable
	 */
	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("E:\\Java\\WebDriverApplication\\Data\\commonData.properties");
		Properties pObj=new Properties();
		pObj.load(fis);
		String URL=pObj.getProperty("url");
		String USERNAME=pObj.getProperty("username");
		String PASSWORD=pObj.getProperty("password");
		String BROWSER=pObj.getProperty("browser");
		
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println(BROWSER);
		
		WebDriver driver=null;
		if(BROWSER.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}else if(BROWSER.equals("chrome")) 
		{
			driver=new ChromeDriver();
		}else if(BROWSER.equals("ie")) 
		{
			driver=new InternetExplorerDriver();
		}	
		
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys(USERNAME);
		driver.findElement(By.name("pwd")).sendKeys(PASSWORD);
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
	}

}
