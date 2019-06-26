/**
 * 
 */
package Object_Repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

/**
 * @author Debalina
 *
 */
public class People_And_Organisations {

	/* click on Add Person Button */

	@FindBy(xpath = "//a[text()='Add Person']")
	private WebElement AddPersonLinkEdt;

	/* Fill the form */
	@FindBy(xpath = "//select[@class='js-pretty-select pretty-select']")
	private WebElement AddPersonTitleEdt;

	@FindBy(id = "party:fnDecorate:fn")
	private WebElement AddPersonFnEdt;

	@FindBy(id = "party:lnDecorate:ln")
	private WebElement AddPersonLnEdt;

	@FindBy(id = "party:roleDecorate:jobTitle")
	private WebElement AddPersonJobTitleEdt;

	@FindBy(id = "party:orgDecorate:org")
	private WebElement AddPersonOrgEdt;

	@FindBy(id = "party:j_id325:0:phnDecorate:number")
	private WebElement AddPersonMbNoEdt;

	@FindBy(id = "party:j_id342:0:emlDecorate:nmbr")
	private WebElement AddPersonEmailEdt;

	@FindBy(id = "party:tagsDecorate:tagComboBox")
	private WebElement AddPersonTagEdt;

	@FindBy(id = "party:tagsDecorate:j_id187")
	private WebElement AddPersonTagBtnEdt;

	@FindBy(xpath = "//span[text()='Ad‌d an ad‌dress']")
	private WebElement AddPersonAddBtnEdt;

	@FindBy(id = "party:j_id389:0:strDecorate:str")
	private WebElement AddPersonAddEdt;

	@FindBy(name = "party:j_id389:0:j_id438")
	private WebElement AddPersonAddTagEdt;

	@FindBy(id = "party:j_id389:0:ctyDecorate:cty")
	private WebElement AddPersonAddCityEdt;

	@FindBy(id = "party:j_id389:0:rgnDecorate:dist")
	private WebElement AddPersonAddstateEdt;

	@FindBy(id = "party:j_id389:0:ctyPstCd:pstCd")
	private WebElement AddPersonAddZipEdt;

	@FindBy(id = "party:save")
	private WebElement AddPersonSaveBtnEdt;

	@FindBy(xpath = "//span[@class='party-details-title']")
	private WebElement AddPersonVerifyEdt;

	@FindBy(xpath = "//a[@aria-label='Cases']")
	private WebElement clickOnCasesBtnEdt;

	public void clickOnAddPersonLink() {
		AddPersonLinkEdt.click();
	}

	public void goToAddPersonPage(String title, String firstName, String lastName, String jobTitle, String org,
			String tag, String phnNo, String email, String address, String addressTag, String city, String state,
			String zip) {
		/* Title */
		Select addtitle = new Select(AddPersonTitleEdt);
		addtitle.selectByVisibleText(title);
		/* First Name */
		AddPersonFnEdt.sendKeys(firstName);
		/* Last Name */
		AddPersonLnEdt.sendKeys(lastName);
		/* Job Title */
		AddPersonJobTitleEdt.sendKeys(jobTitle);
		/* Organization */
		AddPersonOrgEdt.sendKeys(org);
		/* Tag */
		AddPersonTagEdt.sendKeys(tag);
		AddPersonTagBtnEdt.click();
		/* Mobile No. */
		AddPersonMbNoEdt.sendKeys(phnNo);
		/* Email */
		AddPersonEmailEdt.sendKeys(email);
		/* ===Address=== */
		AddPersonAddBtnEdt.click();
		/* Address Body */
		AddPersonAddEdt.sendKeys(address);
		/* Address Tag */
		Select addTag = new Select(AddPersonAddTagEdt);
		addTag.selectByVisibleText(addressTag);
		/* City */
		AddPersonAddCityEdt.sendKeys(city);
		/* state */
		AddPersonAddstateEdt.sendKeys(state);
		/* zip */
		AddPersonAddZipEdt.sendKeys(zip);

		/* save button */
		AddPersonSaveBtnEdt.click();

	}

	/* Verify recent add person exist or not */
	public void verifyAddedPerson(String FirstName) {
		String str = AddPersonVerifyEdt.getText();
		String arr[] = str.split((" "));

		try {
			Assert.assertEquals(arr[1], FirstName);
			System.out.println(AddPersonVerifyEdt.getText() + " is added in the list");
		} catch (Exception e) {
			System.out.println(AddPersonVerifyEdt.getText() + " is not added in the list");
		}
	}

	/* Click on Case Icon */
	public void clickOnCasesBtn() {
		clickOnCasesBtnEdt.click();
	}
}
