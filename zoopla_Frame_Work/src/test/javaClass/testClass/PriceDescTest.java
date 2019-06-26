/**
 * 
 */
package testClass;
import org.testng.annotations.Test;
import ObjectRepo.HomeRepo;
import ObjectRepo.SearchRepo;
import mainRepository.BaseClassLib;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Debalina
 *
 */

public class PriceDescTest extends BaseClassLib{

@Test
public void loginWithoutPasswordTest() {
   HomeRepo hR=PageFactory.initElements(driver, HomeRepo.class);
   SearchRepo sR=PageFactory.initElements(driver, SearchRepo.class);
	hR.datasearch();
   sR.gatherPrice();
	
    }
}
