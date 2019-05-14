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
public class OpenTask {

	@FindBy(linkText = "Projects & Customers")
	private WebElement projAndCusLnk;

	public void clickOnprojAndCusLnk() {
		projAndCusLnk.click();

	}

}
