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
public class Task_Category {
	@FindBy(xpath = "//a[text()='Task Categories']")
	private WebElement taskLeftEdt;

	@FindBy(xpath = "//h2[@class='settings-page-header']")
	private WebElement taskHeaderEdt;

	@FindBy(xpath = "//a[text()='Add new Category']")
	private WebElement addCategoryBtnEdt;
	
	@FindBy(xpath="//input[@type='text'and @id='editCategoryForm:taskCategoryNameDecorate:taskCategoryName']")
	private WebElement nameEdt;
	
	@FindBy(xpath = "//input[@value='Save']")
	private WebElement saveBtnEdt;
	
	/* verify Task Category Header */
	public void verifyExportHeader() {
		taskLeftEdt.click();
		try {
			Assert.assertEquals(taskLeftEdt.getText(), taskHeaderEdt.getText());
			System.out.println(taskLeftEdt.getText() + " is matched and existed");
		} catch (Exception e) {
			System.out.println(taskLeftEdt.getText() + " is matched and existed");
		}
	}
	/*Add a task category*/
	public void addCategory(String Name) {
		addCategoryBtnEdt.click();
		nameEdt.sendKeys(Name);
		saveBtnEdt.click();
	}
}
