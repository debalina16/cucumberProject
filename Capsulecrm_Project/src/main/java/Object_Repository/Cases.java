/**
 * 
 */
package Object_Repository;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

/**
 * @author Debalina
 *
 */
public class Cases {
	@FindBy(xpath = "//a[text()='Add Case']")
	private WebElement clickOnAddCaseBtnEdt;
	@FindBy(id="partySearch")
	private WebElement caseRelatedEdt;
	@FindBy(id="caseNameDecorate:name")
	private WebElement nameEdt;
	@FindBy(id="caseDescriptionDecorate:description")
	private WebElement descEdt;
	@FindBy(id="tagsDecorate:tagComboBox")
	private WebElement tagEdt;
	@FindBy(id="tagsDecorate:j_id191")
	private WebElement tagBtnEdt;
	@FindBy(id="save")
	private WebElement saveBtnEdt;
	@FindBy(xpath="//div[@class=\"entity-details-title\"]")
	private WebElement AddedCaseVerifyEdt;
	@FindBy(xpath="//span[@class='kase-summary-status-open']")
	private WebElement statusVerifyEdt;

	/*Click on Add Case Button*/
	public void clickOnAddCaseBtn() {
		clickOnAddCaseBtnEdt.click();
	}
	/*Add a Case */
	public void addCaseEdt(String person,String name,String description,String tag) throws AWTException, InterruptedException {
		caseRelatedEdt.sendKeys(person);
		Thread.sleep(2000);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		nameEdt.sendKeys(name);
		descEdt.sendKeys(description);
		tagEdt.sendKeys(tag);
		tagBtnEdt.click();
		saveBtnEdt.click();
	}
	/*Added case verification*/
	public void AddedCaseVerify(String AdddedcaseName) {
		try {
		Assert.assertEquals(AddedCaseVerifyEdt.getText(), AdddedcaseName);
		System.out.println(AdddedcaseName+" is added for cases");
		}catch(Exception e) {
		System.out.println(AdddedcaseName+" is not added for cases");
		}
	}
	/*verify status*/
	public void statusVerify() {
		try {
		Assert.assertTrue(statusVerifyEdt.isDisplayed());
		System.out.println("Case status is Open");
		}catch(Exception e) {
		System.out.println("Case status is not Open");
		}
	}		
}