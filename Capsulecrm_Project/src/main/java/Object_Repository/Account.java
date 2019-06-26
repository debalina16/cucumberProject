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
public class Account {
	@FindBy(xpath = "//span[text()='Account Settings']")
	private WebElement accountSettingsheaderEdt;

	@FindBy(xpath = "//a[contains(@href,'/settings/account')and text()='Account']")
	private WebElement accountLeftEdt;

	@FindBy(xpath = "//h1[@class='settings-page-header']")
	private WebElement accountHeaderEdt;

	@FindBy(xpath = "//a[contains(@href,'/account/invoices')]")
	private WebElement invoicesLeftEdt;

	@FindBy(xpath = "//header[@class='page-box-header']")
	private WebElement invoicesHeaderEdt;

	@FindBy(xpath = "//a[contains(@href,'/settings/account/export')]")
	private WebElement exportLeftEdt;

	@FindBy(xpath = "//h1[@class='settings-page-header']")
	private WebElement exportHeaderEdt;
	
    @FindBy(xpath = "//a[contains(@href,'/settings/dropbox')]")
	private WebElement mailboxLeftEdt;

	@FindBy(xpath = "//h2[@class='settings-page-header']")
	private WebElement mailboxHeaderEdt;
	
	@FindBy(xpath = "//a[text()='Custom Fields']")
	private WebElement customLeftEdt;

	@FindBy(xpath = "//h2[text()='Custom Fields']")
	private WebElement customHeaderEdt;
	
	@FindBy(xpath = "//a[text()='Trash']")
	private WebElement trashLeftEdt;

	@FindBy(xpath = "//h2[@class='settings-page-header']")
	private WebElement trashHeaderEdt;

	/* verify Account Settings Header */
	public void verifyaccountSettingsheader() {
		try {
			Assert.assertTrue(accountSettingsheaderEdt.isDisplayed());
			System.out.println("Account Settings header is displayed");
		} catch (Exception e) {
			System.out.println("Account Settings header is not displayed");
		}
	}

	/* verify Account Header */
	public void verifyAccountHeader() {
		try {
			Assert.assertEquals(accountLeftEdt.getText(), accountHeaderEdt.getText());
			System.out.println(accountHeaderEdt.getText() + " is matched and existed");
		} catch (Exception e) {
			System.out.println(accountHeaderEdt.getText() + " is matched and existed");
		}
	}

	/* verify Invoices Header */
	public void verifyInvoicesHeader() {
		invoicesLeftEdt.click();
		try {
			Assert.assertEquals(invoicesLeftEdt.getText(), invoicesHeaderEdt.getText());
			System.out.println(invoicesHeaderEdt.getText() + " is matched and existed");
		} catch (Exception e) {
			System.out.println(invoicesHeaderEdt.getText() + " is matched and existed");
		}
	}

	/* verify Export Header */
	public void verifyExportHeader() {
		exportLeftEdt.click();
		try {
			Assert.assertEquals(exportLeftEdt.getText(), exportHeaderEdt.getText());
			System.out.println(exportLeftEdt.getText() + " is matched and existed");
		} catch (Exception e) {
			System.out.println(exportLeftEdt.getText() + " is matched and existed");
		}
	}

	/* verify Mailbox Header */
	public void verifymailboxHeader() {
		mailboxLeftEdt.click();
		try {
			Assert.assertEquals(mailboxLeftEdt.getText(), mailboxHeaderEdt.getText());
			System.out.println(mailboxLeftEdt.getText() + " is matched and existed");
		} catch (Exception e) {
			System.out.println(mailboxLeftEdt.getText() + " is matched and existed");
		}
	}
	
		/* verify Custom Fields Header */
	public void verifycustomHeader() {
		customLeftEdt.click();
		try {
			Assert.assertEquals(customLeftEdt.getText(), customHeaderEdt.getText());
			System.out.println(customLeftEdt.getText() + " is matched and existed");
		} catch (Exception e) {
			System.out.println(customLeftEdt.getText() + " is matched and existed");
		}
	}

	/* verify Trash Header */
	public void verifytrashHeader() {
		trashLeftEdt.click();
		try {
			Assert.assertEquals(trashLeftEdt.getText(), trashHeaderEdt.getText());
			System.out.println(trashLeftEdt.getText() + " is matched and existed");
		} catch (Exception e) {
			System.out.println(trashLeftEdt.getText() + " is matched and existed");
		}
	}

}
