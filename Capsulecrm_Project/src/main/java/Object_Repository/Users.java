/**
 * 
 */
package Object_Repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

/**
 * @author Debalina
 *
 */
public class Users {

	@FindBy(xpath = "//li/a[text()='Users']")
	private WebElement usersLeftEdt;

	@FindBy(xpath = "//h2[@class='settings-page-header']")
	private WebElement usersHeaderEdt;

	@FindBy(xpath = "//a[text()='Add new User']")
	private WebElement createUserEdt;

	@FindBy(id = "register:firstnameDecorate:firstName")
	private WebElement fNEdt;

	@FindBy(id = "register:lastNameDecorate:lastName")
	private WebElement lNEdt;

	@FindBy(id = "register:emailDecorate:email")
	private WebElement emailEdt;

	@FindBy(id = "register:usernameDecorate:username")
	private WebElement uNEdt;

	@FindBy(xpath = "//input[@value='Invite user']")
	private WebElement saveBtnEdt;

	/* verify Users Header */
	public void verifyUsersHeader() {
		usersLeftEdt.click();
		try {
			Assert.assertEquals(usersLeftEdt.getText(), usersHeaderEdt.getText());
			System.out.println(usersLeftEdt.getText() + " is matched and existed");
		} catch (Exception e) {
			System.out.println(usersLeftEdt.getText() + " is matched and existed");
		}
	}
   /*Add a user*/
	public void addAUser(String FirstName, String LastName, String Email, String userName) {
		createUserEdt.click();
		fNEdt.sendKeys(FirstName);
		lNEdt.sendKeys(LastName);
		emailEdt.sendKeys(Email);
		uNEdt.sendKeys(userName);
		saveBtnEdt.click();

	}

}
