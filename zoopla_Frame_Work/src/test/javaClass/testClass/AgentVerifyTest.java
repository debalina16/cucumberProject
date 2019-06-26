/**
 * 
 */
package testClass;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ObjectRepo.AgentDetailsVerifyRepo;
import ObjectRepo.HomeRepo;
import ObjectRepo.SearchRepo;
import mainRepository.BaseClassLib;
import mainRepository.WebdriverCommonLib;

/**
 * @author Debalina
 *
 */
@Test
public class AgentVerifyTest extends BaseClassLib{
	public void verifyAgent() throws Exception {
	WebdriverCommonLib wb=new WebdriverCommonLib(); 
	HomeRepo hR = PageFactory.initElements(driver, HomeRepo.class);
	SearchRepo sR = PageFactory.initElements(driver, SearchRepo.class);
	AgentDetailsVerifyRepo ad=PageFactory.initElements(driver, AgentDetailsVerifyRepo.class);
	wb.waitForPageToLoad(driver);
	hR.datasearch();
	sR.clickOn5thProperty(5);
	ad.agentDetailsDisplay();
	ad.verifyAgentDetails();
	
	}
}
