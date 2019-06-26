package CustomerData;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Object_Repository.Cases;
import Object_Repository.Home;
import Object_Repository.People_And_Organisations;
import main.BaseClassLib;
import main.FileLib;


/**
 * @author Debalina
 *
 */

public class testCaseOne extends BaseClassLib{
@Test
void testOne() throws Throwable {
	FileLib fLib=new FileLib();
	/*Data for Added user*/
	String title =    fLib.getExcelData("Sheet1", 1,0);
	String fN =       fLib.getExcelData("Sheet1", 1,1);
	String lN =       fLib.getExcelData("Sheet1", 1,2);
	String jobtitle = fLib.getExcelData("Sheet1", 1,3);
	String org =      fLib.getExcelData("Sheet1", 1,4);
	String tag =      fLib.getExcelData("Sheet1", 1,5);
	String mob =      fLib.getExcelData("Sheet1", 1,6);
	String email =    fLib.getExcelData("Sheet1", 1,7);
	String add =      fLib.getExcelData("Sheet1", 1,8);
	String addTag =   fLib.getExcelData("Sheet1", 1,9);
	String city =     fLib.getExcelData("Sheet1", 1,10);
	String state =    fLib.getExcelData("Sheet1", 1,11);
	String zip =      fLib.getExcelData("Sheet1", 1,12);
	
	
   /*Click on People and organization Button*/
	Home hp = PageFactory.initElements(driver,Home.class);
	hp.clickOnPeople_And_Organisations_Icon();
	
	/*Click on Add person Button*/
	People_And_Organisations po=PageFactory.initElements(driver, People_And_Organisations.class);
	po.clickOnAddPersonLink();
	
	/*Add a person*/
	po.goToAddPersonPage(title, fN, lN, jobtitle, org, tag, mob, email, add, addTag, city, state, zip);
	
	/*Verify recent add person exist or not*/
	po.verifyAddedPerson(fN);
	
	/*Click on Case Icon*/
	po.clickOnCasesBtn();
	
	/*Click on Add Case Button*/
	Cases cs=PageFactory.initElements(driver, Cases.class);
	cs.clickOnAddCaseBtn();
	
	/*Add a Case */
	String person =     fLib.getExcelData("Sheet2", 1,0);
	String name =       fLib.getExcelData("Sheet2", 1,1);
	String desc =       fLib.getExcelData("Sheet2", 1,2);
	String caseTag =    fLib.getExcelData("Sheet2", 1,3);
	cs.addCaseEdt(person, name, desc, caseTag);
	
	/*Added case verification*/
	cs.AddedCaseVerify(name);
	
	/*verify status*/
	cs.statusVerify();
 }
}
