/**
 * 
 */
package Annotation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

/**
 * @author Debalina
 *
 */
public class ScreenshotTest {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		/* Capture the file type of screenshot using "EventFiringWebDriver" class */
		EventFiringWebDriver eDriver = new EventFiringWebDriver(driver);
        File srcFile = eDriver.getScreenshotAs(OutputType.FILE);
		/* create a new file in destination location */
		File destFile = new File("C:\\Users\\Debalina\\Desktop\\data\\test.png");
		/* copy the screenshot in a destination location */
		FileUtils.copyFile(srcFile, destFile);
	}

}
