package object_Repository;
/**
 * 
 */


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import main.FileLib;


/**
 * @author Debalina
 *
 */
public class Login {
	@FindBy(name="username")
	private WebElement usernameEdt;
	@FindBy(name="pwd")
	private WebElement passwordEdt;
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	public void loginToApp() throws Throwable {
		FileLib fLib=new FileLib();
		usernameEdt.sendKeys(fLib.getPropertyKeyValue("username"));
		passwordEdt.sendKeys(fLib.getPropertyKeyValue("password"));
		loginButton.click();
	}
	public void loginToApp(String username,String password) throws Throwable {
		usernameEdt.sendKeys(username);
		passwordEdt.sendKeys(password);
		loginButton.click();
	}

	public WebElement getUsernameEdt() {
		return usernameEdt;
	}
	
	public WebElement getPasswordEdt() {
		return passwordEdt;
	}
	
	public WebElement getLoginButton() {
		return loginButton;
	}
	
}
