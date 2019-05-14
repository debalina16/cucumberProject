package Pack7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FileDownload {
public static void main(String[] args) {
	FirefoxProfile profile=new FirefoxProfile();
	profile.setPreference("browser.download.folderList",2);
	profile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/zip");
	profile.setPreference("browser.download.dir","E:\\Data\\");
	
	DesiredCapabilities capabilities=DesiredCapabilities.firefox();
	capabilities.setCapability(FirefoxDriver.PROFILE, profile);
	
	WebDriver d=new FirefoxDriver(capabilities);
	d.get("http://maven.apache.org/download.cgi");
	
	//click on a link,which download zip file via download window
	d.findElement(By.linkText("apache-maven-3.6.1-bin.zip")).click();	
}
}
