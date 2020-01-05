/**
 * 
 */
package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Debalina
 *
 */
public class LoginPagePOM {
public WebDriver ldriver;

public LoginPagePOM(WebDriver rdriver)
{
	ldriver=(WebDriver) rdriver;
	PageFactory.initElements(ldriver, this);
	
}
By logintxt=By.xpath("//input[@class='email']");
By passwordtxt=By.xpath("//input[@class='password']");
By loginBtn=By.xpath("//input[@value='Log in']");
By logoutBtn=By.linkText("Logout");

public void inputUserId(String userName) {
	ldriver.findElement(logintxt).sendKeys(userName);
}
public void inputPassword(String password) {
	ldriver.findElement(passwordtxt).sendKeys(password);
}
public void submitBtn() {
	ldriver.findElement(loginBtn).click();
}
public void logoutBtn() {
	ldriver.findElement(logoutBtn).click();

	
}
}
