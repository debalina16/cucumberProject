/**
 * 
 */
package CustomerData;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import main.BaseClassLib;
import main.FileLib;
import object_Repository.Home;
import object_Repository.OpenTask;
import object_Repository.ProjectAndCustomer;
import object_Repository.createCustomer;



/**
 * @author Debalina
 *
 */
@Listeners(main.ListenerImpClass.class)
public class customerTest extends BaseClassLib {
	FileLib fLib = new FileLib();

	@Test
	public void createCustometTest() throws Throwable {
		String customerName = fLib.getExcelData("Sheet5", 1, 2);
		Home hp = PageFactory.initElements(driver, Home.class);
		hp.clickOnTaskImage();

		OpenTask op = PageFactory.initElements(driver, OpenTask.class);
		op.clickOnprojAndCusLnk();

		ProjectAndCustomer pac = PageFactory.initElements(driver, ProjectAndCustomer.class);
		pac.clickOnCreateCustomerBtn();

		createCustomer cp = PageFactory.initElements(driver, createCustomer.class);
		cp.createCustomerEdt(customerName);

		String actMsg = pac.clickOnSuccessMsg().getText();
		boolean status = actMsg.contains("successfully created.");
		Assert.assertTrue(status);
	}
}
