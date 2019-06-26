/**
 * 
 */
package Object_Repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import main.FileLib;

/**
 * @author Debalina
 *
 */
public class Login {
@FindBy(id="login:usernameDecorate:username")
private WebElement usernameEdt;

@FindBy(id="login:passwordDecorate:password")
private WebElement passwordEdt;

@FindBy(id="login:login")
private WebElement loginButton;

public void loginToApp() throws Throwable {
	FileLib fLib=new FileLib();
	usernameEdt.sendKeys(fLib.getPropertyKeyValue("username"));
	passwordEdt.sendKeys(fLib.getPropertyKeyValue("password"));
	loginButton.click();	
}
}
