/**
 * 
 */
package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

/**
 * @author Debalina
 *
 */
public class AgentDetailsVerifyRepo {
	@FindBy(xpath = "//div[@class='dp-sidebar-wrapper__contact']/div[1]/p/a")
	private WebElement agentContactNo;

	@FindBy(xpath = "//div[@class='dp-sidebar-wrapper__contact']/div[1]/a/div[2]/h4")
	private WebElement agentDetails;

	@FindBy(xpath = "//div[@class='dp-sidebar-wrapper__contact']/div[1]/a/div[1]/img")
	private WebElement agentLogo;

	@FindBy(xpath = "//div[@id='content']/div/h1")
	private WebElement agentName;

	public void agentDetailsDisplay() {
		System.out.println("Agent Name is " + agentDetails.getText());
		try {
			Assert.assertTrue(agentLogo.isDisplayed());
			System.out.println("Agent Logo is " + agentLogo.getAttribute("alt") + "==>Passed");
		} catch (Exception e) {
			System.out.println("Agent logo is not displayed==>Failed");
		}

		System.out.println("Agent Contact No. is " + agentContactNo.getText().replaceAll("[\\^a-zA-Z]", "").trim());
	}

	public void verifyAgentDetails() {
		String expectedAgent[] = agentDetails.getText().replaceAll("[\\-\\s\\,]", " ").split(" ");
		agentDetails.click();
		String actualAgent[] = agentName.getText().replaceAll("[\\-\\s\\,]", " ").split(" ");

		try {
			Assert.assertEquals(actualAgent[0], expectedAgent[0]);
			System.out.println("Agent Name is matched==>Passed");
		} catch (Exception e) {
			System.out.println("Agent Name is not matched==>Failed");
		}
	}

}
