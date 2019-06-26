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
public class Appearances {
	@FindBy(xpath = "//a[text()='Appearance']")
	private WebElement appearanceBtnEdt;

	@FindBy(xpath = "//h1[@class='settings-page-header']")
	private WebElement appearanceHeaderEdt;

	@FindBy(id = "appearance:uploadDecorate:logoImage")
	private WebElement browserBtnEdt;

	/* verify Appearance Header */
	public void verifyAppearanceHeader() throws Throwable {
		appearanceBtnEdt.click();
		try {
			Assert.assertEquals(appearanceBtnEdt.getText(), appearanceHeaderEdt.getText());
			System.out.println(appearanceBtnEdt.getText() + " is matched and existed");
		} catch (Exception e) {
			System.out.println(appearanceBtnEdt.getText() + " is matched and existed");
		}

		/* pass the path of the file to be uploaded using Sendkeys method */
		browserBtnEdt.sendKeys("C:\\Users\\Debalina\\Downloads\\data1.pdf");

	}

}
