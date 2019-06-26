/**
 * 
 */
package testClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import ObjectRepo.AgentDetailsVerifyRepo;

/**
 * @author Debalina
 *
 */
public class demoTest {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.zoopla.co.uk/for-sale/details/51890095?search_identifier=6323219902a84fc51cd97861178ef6ce");
	AgentDetailsVerifyRepo ad=PageFactory.initElements(driver, AgentDetailsVerifyRepo.class);
	ad.agentDetailsDisplay();
	ad.verifyAgentDetails();
	

}
}
