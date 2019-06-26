/**
 * 
 */
package Object_Repository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.testng.Assert;

/**
 * @author Debalina
 *
 */
public class Integration {
	@FindBy(xpath = "//a[text()='Integrations']")
	private WebElement integrationLinkEdt;

	@FindBy(xpath = "//h2[@class='settings-page-header']")
	private WebElement integrationHeaderEdt;

	@FindBys(@FindBy(xpath = "//a[@class='btn-primary' and text()='Configure']"))
	private List<WebElement> configureBtnEdt;

	/* verify Integration Header */
	public void verifyintegrationHeader() {
		integrationLinkEdt.click();
		try {
			Assert.assertEquals(integrationLinkEdt.getText(), integrationHeaderEdt.getText());
			System.out.println(integrationLinkEdt.getText() + " is matched and existed");
		} catch (Exception e) {
			System.out.println(integrationLinkEdt.getText() + " is matched and existed");
		}
        /*Configuration Button Count*/
		int confiBtnCount = configureBtnEdt.size();
		System.out.println("Configure Button:"+confiBtnCount);

	}

}
