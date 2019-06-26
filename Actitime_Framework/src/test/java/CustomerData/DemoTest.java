/**
 * 
 */
package CustomerData;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import main.BaseClassLib;
import main.FileLib;
import object_Repository.Home;
import object_Repository.OpenTask;
import object_Repository.ProjectAndCustomer;
import object_Repository.createCustomer;
import object_Repository.createProject;
import object_Repository.createUser;

/**
 * @author Debalina
 *
 */
@Listeners(main.ListenerImpClass.class)
public class DemoTest extends BaseClassLib {
	FileLib fLib = new FileLib();

	@Test
	public void createCustometWithDescTest() throws Throwable {
		String customerName = fLib.getExcelData("Sheet5", 4, 2);
		String customerDesc = fLib.getExcelData("Sheet5", 4, 3);
		String projectDescripion = fLib.getExcelData("Sheet5", 10, 2);
		String projectName = fLib.getExcelData("Sheet5", 10, 3);
		String fN = fLib.getExcelData("Sheet3", 2, 1);
		String mN = fLib.getExcelData("Sheet3", 2, 2);
		String lN = fLib.getExcelData("Sheet3", 2, 3);
		String uN = fLib.getExcelData("Sheet3", 2, 0);
		String pW = fLib.getExcelData("Sheet3", 2, 4);
		String eM = fLib.getExcelData("Sheet3", 2, 5);
		/* login to app */
		Home hp = PageFactory.initElements(driver, Home.class);
		/* click on Task Icon */
		hp.clickOnTaskImage();

		OpenTask op = PageFactory.initElements(driver, OpenTask.class);
		/* click on project And Customer Link */
		op.clickOnprojAndCusLnk();

		ProjectAndCustomer pac = PageFactory.initElements(driver, ProjectAndCustomer.class);
		/* click on Create Customer Button */
		pac.clickOnCreateCustomerBtn();
		/* Create Customer */
		createCustomer cp = PageFactory.initElements(driver, createCustomer.class);
		cp.createCustomerEdt(customerName, customerDesc);
		/* verify customer added or not */
		String actMsg = pac.clickOnSuccessMsg().getText();
		boolean status = actMsg.contains("successfully created.");
		Assert.assertTrue(status);
		/* click on Create Project Button */
		pac.clickOnCreateProjBtn();
		/* Create Project */
		createProject cpr = PageFactory.initElements(driver, createProject.class);
		cpr.createProjectEdit(customerName, projectDescripion, projectName);

		/* click on Create User Icon */
		pac.clickOnCreateUserImg();
		/* click on User Button */
		pac.clickOnUserBtn();
		/* Create User */
		createUser cu = PageFactory.initElements(driver, createUser.class);
		cu.createCustomerEdt(fN, mN, uN, lN, eM, pW, pW);
		/* verify customer User or not */
		Boolean flag = false;
		for (WebElement wb1 : cu.clickOncustomerVerify()) {
			if (wb1.getText().contains(fN)) {
				Assert.assertTrue(wb1.getText().contains(fN));
				flag = true;
				break;
			}
		}
		if (flag == true) {
			System.out.println(fN+ " is found==>Pass");

		} else {
			System.out.println(fN + " is not found==>Fail");
		}

	}
}
