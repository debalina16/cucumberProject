package object_Repository;
/**
 * 
 */


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Debalina
 *
 */
public class ProjectAndCustomer {
	@FindBy(xpath="//span[text()='Create Customer']")
	private WebElement createCustomerBtn;
	
	@FindBy(xpath="//span[@class='successmsg']")
	private WebElement successMsg;
	
	@FindBy(xpath="//div[text()='Users']")
	private WebElement CreateUserImg;
	
	@FindBy(xpath="//span[text()='User']")
	private WebElement UserBtn;
	
	public void clickOnCreateCustomerBtn() {
		createCustomerBtn.click();

	}
	public WebElement clickOnSuccessMsg() {
		return successMsg;

	}
	public void clickOnCreateUserImg() {
		CreateUserImg.click();

	}
	public void clickOnUserBtn() {
		UserBtn.click();

	}
}
