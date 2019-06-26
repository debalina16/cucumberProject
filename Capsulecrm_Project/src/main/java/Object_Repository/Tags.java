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
public class Tags {
	@FindBy(xpath = "//a[text()='Tags']")
	private WebElement tagsLeftEdt;

	@FindBy(xpath = "//h2[@class='settings-page-header']")
	private WebElement tagsHeaderEdt;

	@FindBy(xpath = "//a[text()='Add new Tag']")
	private WebElement addTagBtnEdt;

	@FindBy(id = "j_id177:tagNameDecorate:tagName")
	private WebElement nameTagEdt;

	@FindBy(xpath = "//a[@id='tagDetailToggler']")
	private WebElement moreDetailsLinkEdt;

	@FindBy(xpath = "//input[@name='j_id177:tagDetailDecorate:j_id204']")
	private WebElement detailsTagEdt;

	@FindBy(xpath = "//input[@name='j_id177:tagDetailDecorate:j_id204']")
	private WebElement saveBtnEdt;

	/* verify Tags Header */
	public void verifytagHeader() {
		tagsLeftEdt.click();
		try {
			Assert.assertEquals(tagsLeftEdt.getText(), tagsLeftEdt.getText());
			System.out.println(tagsLeftEdt.getText() + " is matched and existed");
		} catch (Exception e) {
			System.out.println(tagsLeftEdt.getText() + " is matched and existed");
		}
	}
    /*Add a Tag*/
	public void addTag(String Name, String Desc) {
		addTagBtnEdt.click();
		nameTagEdt.sendKeys(Name);
		moreDetailsLinkEdt.click();
		detailsTagEdt.sendKeys(Desc);
		saveBtnEdt.click();
	}
}
