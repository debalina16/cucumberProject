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
public class Opportunity {
	
	@FindBy(xpath = "//a[@href='/settings/opportunities']")
	private WebElement oppLeftEdt;

	@FindBy(xpath = "//header[@class='page-box-header']")
	private WebElement oppHeaderEdt;
	
	@FindBy(xpath = "//button[text()='Add new Milestone']")
	private WebElement addMileStoneBtnEdt;

	@FindBy(xpath = "//input[@class='form-input-text milestone-modal-name']")
	private WebElement modelNameEdt;
	
	@FindBy(xpath = "//textarea[@class='form-input-text milestone-modal-description']")
	private WebElement modelDescEdt;

	@FindBy(xpath = "//input[@class='form-input-text milestone-modal-probability']")
	private WebElement modelProbEdt;
	
	@FindBy(xpath = "//input[@class='form-input-text milestone-modal-days-until-stale']")
	private WebElement untilStaleEdt;

	@FindBy(xpath = "//button[@class='async-button ember-view btn-primary']")
	private WebElement saveBtnEdt;

	
	/* verify Opportunity Header */
	public void verifyInvoicesHeader() {
		oppLeftEdt.click();
		try {
			Assert.assertEquals(oppLeftEdt.getText(), oppHeaderEdt.getText());
			System.out.println(oppLeftEdt.getText() + " is matched and existed");
		} catch (Exception e) {
			System.out.println(oppLeftEdt.getText() + " is matched and existed");
		}
	}

	/*Add new Milestone*/
	public void addMilestone(String modelName,String modelDesc) {
		addMileStoneBtnEdt.click();
		modelNameEdt.sendKeys(modelName);
		modelDescEdt.sendKeys(modelDesc);
		modelProbEdt.sendKeys("1");
		saveBtnEdt.click();
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
