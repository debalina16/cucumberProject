package pack1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SampleTest {

	public static void main(String[] args) {
	    System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://gmail.com");
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.get("https://facebook.com");
		
		System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		InternetExplorerDriver driver2=new InternetExplorerDriver();
		driver2.get("https://yahoo.com");
		
	}
}
