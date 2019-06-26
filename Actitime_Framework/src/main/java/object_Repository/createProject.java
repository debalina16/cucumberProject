/**
 * 
 */
package object_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import main.BaseClassLib;

/**
 * @author Debalina
 *
 */
public class createProject {
	@FindBy(xpath="//select[@name='customerId']")
	private WebElement customerDropDown;
	
	@FindBy(xpath="//input[@name='name']")
	private WebElement projName;
	
	@FindBy(xpath="//textarea[@name='description']")
	private WebElement projDesc;
	
	@FindBy(xpath="//input[@name='createProjectSubmit']")
	private WebElement submitBtn;
	
	public void createProjectEdit(String customerName,String ProjectDescripion,String ProjectName) throws InterruptedException {
		//System.out.println( customerName+ProjectDescripion+ProjectName);
		projName.sendKeys(ProjectName);
		projDesc.sendKeys(ProjectDescripion);
		customerDropDown.click();
		String x="//select/option[text()='"+customerName+"']";
		Thread.sleep(2000);
		BaseClassLib.driver.findElement(By.xpath(x)).click();
		submitBtn.click();
	}
}

