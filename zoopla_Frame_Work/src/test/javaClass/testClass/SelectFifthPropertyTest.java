/**
 * 
 */
package testClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ObjectRepo.HomeRepo;
import ObjectRepo.SearchRepo;
import mainRepository.BaseClassLib;
import mainRepository.WebdriverCommonLib;

/**
 * @author Debalina
 *
 */
public class SelectFifthPropertyTest extends BaseClassLib {
	@Test
	public void loginWithoutPasswordTest() throws Throwable {
		WebdriverCommonLib wb=new WebdriverCommonLib();
		wb.waitForPageToLoad(driver);
		HomeRepo hR = PageFactory.initElements(driver, HomeRepo.class);
		SearchRepo sR = PageFactory.initElements(driver, SearchRepo.class);
		hR.datasearch();
		sR.clickOn5thProperty(5);
	}
}
