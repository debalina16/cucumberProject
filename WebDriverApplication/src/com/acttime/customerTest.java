/**
 * 
 */
package com.acttime;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.actitime.genericlib.BaseClassLib;
import com.actitime.genericlib.FileLib;
import com.actitime.objectRepositoryLib.Home;
import com.actitime.objectRepositoryLib.OpenTask;
import com.actitime.objectRepositoryLib.ProjectAndCustomer;
import com.actitime.objectRepositoryLib.createCustomer;
import com.actitime.objectRepositoryLib.createUser;

/**
 * @author Debalina
 *
 */
@Listeners(com.actitime.genericlib.ListenerImpClass.class)
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
	/*@Test
	public void createCustometWithDescTest() throws Throwable {
		String customerName = fLib.getExcelData("Sheet5", 4, 2);
		String customerDesc = fLib.getExcelData("Sheet5", 4, 3);
		String fN=fLib.getExcelData("Sheet3", 2, 1);
		String mN=fLib.getExcelData("Sheet3", 2, 2);
		String lN=fLib.getExcelData("Sheet3", 2, 3);
		String uN=fLib.getExcelData("Sheet3", 2, 0);
		String pW=fLib.getExcelData("Sheet3", 2, 4);
		String eM=fLib.getExcelData("Sheet3", 2, 5);
		
		Home hp = PageFactory.initElements(driver, Home.class);
		hp.clickOnTaskImage();

		OpenTask op = PageFactory.initElements(driver, OpenTask.class);
		op.clickOnprojAndCusLnk();

		ProjectAndCustomer pac = PageFactory.initElements(driver, ProjectAndCustomer.class);
		pac.clickOnCreateCustomerBtn();

		createCustomer cp = PageFactory.initElements(driver, createCustomer.class);
		cp.createCustomerEdt(customerName, customerDesc);

		String actMsg = pac.clickOnSuccessMsg().getText();
		boolean status = actMsg.contains("successfully created.");
		Assert.assertTrue(status);
		
		pac.clickOnCreateUserImg();
		pac.clickOnUserBtn();
		
		createUser cu=PageFactory.initElements(driver, createUser.class);
		cu.createCustomerEdt(fN, mN, uN, lN, eM, pW, pW);
		
		for(WebElement wb1:cu.clickOncustomerVerify()) 
	    {
			Assert.assertTrue(wb1.getText().contains("Das, Dipak Kumar"));
	      	//System.out.println(wb1.getText());
	    }  	
		
	}*/
}
