package main;
/**
 * 
 */

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Debalina
 *
 */
public class WebdriverCommonLib {
/**
 * @param driver
 */
public void waitForPageToLoad(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}

/**
 * @param driver
 * @param element
 */
public void waitForElementPresent(WebDriver driver,WebElement element) {
	FluentWait wait=new FluentWait(driver);
	wait.pollingEvery(5,TimeUnit.SECONDS);
	wait.withTimeout(60,TimeUnit.SECONDS);
	wait.ignoring(Throwable.class);
	wait.until(ExpectedConditions.visibilityOf(element));
}

/**
 * @param driver
 * @param element
 */
public void waitForFluentElementPresent(WebDriver driver,WebElement element) {
	WebDriverWait wait=new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.visibilityOf(element));	
}


/**
 * @param element
 * @param option
 */
public void select(WebElement element,String option) {
	Select sel=new Select(element);
	sel.selectByVisibleText(option);
}
}
