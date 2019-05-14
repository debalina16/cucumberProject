package object_Repository;
/**
 * 
 */

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

/**
 * @author Debalina
 *
 */
public class createUser {

	@FindBy(xpath="//input[@name='firstName']")
	private WebElement FirstNameOpt;
	@FindBy(xpath="//input[@name='middleName']")
	private WebElement MidNameOpt;
	@FindBy(xpath="//input[@name='username']")
    private WebElement USERNAMEOpt;
	@FindBy(xpath="//input[@name='lastName']")
    private WebElement LastNameOpt;
	@FindBy(xpath="//input[@name='email']")
    private WebElement EMAILIDOpt;
	@FindBy(xpath="//input[@name='password']")
    private WebElement PASSWORDOpt;
	@FindBy(xpath="//input[@name='passwordCopy']")
    private WebElement CCPASSWORDOpt;
	@FindBy(xpath="//div[@id='userDataLightBox_commitBtn']")
    private WebElement createUserBtn;
	
	@FindBys(
			@FindBy(xpath="//table[@class='userListTable hidePTO sortByName']/tbody/tr/td[1]")
			)
	private List<WebElement> customerVerify;
	
	@FindBy(xpath="//div[contains(text(),'Dipak')]/../../td/span[text()='Edit']")
	private WebElement createVerifyLnk;
	
	public void createCustomerEdt(String FirstName,String MidName,String USERNAME,String LastName,
			                      String EMAILID,String PASSWORD,String CCPASSWORD) 
	{
		FirstNameOpt.sendKeys(FirstName);
		MidNameOpt.sendKeys(MidName);
		USERNAMEOpt.sendKeys(USERNAME);
		LastNameOpt.sendKeys(LastName);
		EMAILIDOpt.sendKeys(EMAILID);
		PASSWORDOpt.sendKeys(PASSWORD);
		CCPASSWORDOpt.sendKeys(CCPASSWORD);
		createUserBtn.click();
	}
	
	public List<WebElement> clickOncustomerVerify() {
		return customerVerify;

	}
    public void clickOnUserLnk() {
    	createVerifyLnk.click();

	}

  //button[@id='userDataLightBox_deleteBtn']
	
}
