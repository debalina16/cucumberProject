/**
 * 
 */
package Object_Repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import main.BaseClassLib;

/**
 * @author Debalina
 *
 */  
public class Home {
	@FindBy(xpath = "//a[@aria-label='People & Organisations']")
	private WebElement People_And_Organisations_IconEdt;
	
	@FindBy(xpath = "//div[@class='menu-select-selected-option ember-view nav-bar-item nav-bar-account-button']")
	private WebElement accountMenuEdt;
	
	@FindBy(xpath="//a[text()='Account Settings']")
	private WebElement accountSettingOptionEdt;

	/* Click on People and organization Button */
	public void clickOnPeople_And_Organisations_Icon() {
		People_And_Organisations_IconEdt.click();
	}
	
	public void clickOnaccountMenu() {
		accountMenuEdt.click();
		Actions act=new Actions(BaseClassLib.driver);
		act.clickAndHold(accountMenuEdt).doubleClick(accountSettingOptionEdt).build().perform();
	}

}