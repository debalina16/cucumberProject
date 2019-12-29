package mainRepository;
/**
 * 
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;



/**
 * @author Debalina
 *
 */
public class BaseClassLib {
	public static WebDriver driver;
	public static FileLib flib = new FileLib();
	WebdriverCommonLib webdri = new WebdriverCommonLib();

	@BeforeClass
	public void configBC() throws Throwable {
		System.out.println("===========Launch a Browser===========");
		/* Launch a Browser */
		String BROWSER = flib.getPropertyKeyValue("browser");
		if (BROWSER.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (BROWSER.equals("chrome")) {
			driver = new ChromeDriver();
		}
		webdri.waitForPageToLoad(driver);

	}
	
	@BeforeMethod
	public void configBM() throws Throwable {
		/* read data from external resource */
		System.out.println("=====Login=====");
		driver.get(flib.getPropertyKeyValue("url"));
		
	}

	@AfterMethod
	public void configAM() {
		 /*Logout Application */
		System.out.println("=====Logout=====");
		

	}


	@AfterClass
	public void configAC() {
		/* close a browser */
		driver.close();
		System.out.println("===========Close a Browser===========");
	}

}