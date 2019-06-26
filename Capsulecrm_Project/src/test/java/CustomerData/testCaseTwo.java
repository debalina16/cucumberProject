/**
 * 
 */
package CustomerData;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Object_Repository.Account;
import Object_Repository.Appearances;
import Object_Repository.Home;
import Object_Repository.Integration;
import Object_Repository.Opportunity;
import Object_Repository.Tags;
import Object_Repository.Task_Category;
import Object_Repository.Tracks;
import Object_Repository.Users;
import main.BaseClassLib;
import main.FileLib;

/**
 * @author Debalina
 *
 */
public class testCaseTwo extends BaseClassLib {
	@Test
	void testTwo() throws Throwable {
		/* Click on People and organization Button */
		Home hp = PageFactory.initElements(driver, Home.class);
		hp.clickOnaccountMenu();

		/* verify Account Settings Header */
		Account act = PageFactory.initElements(driver, Account.class);
		act.verifyaccountSettingsheader();

		/* verify Account Header */
		act.verifyAccountHeader();

		/* verify Invoices Header */
		act.verifyInvoicesHeader();

		/* verify Export Header */
		act.verifyExportHeader();
		
		/* verify Appearance Header */
		Appearances ap=PageFactory.initElements(driver, Appearances.class);
		ap.verifyAppearanceHeader();
		
		/* verify Mailbox Header */
		act.verifymailboxHeader();
		
		/* verify Users Header */
		Users us=PageFactory.initElements(driver, Users.class);
		FileLib fLib=new FileLib();
		us.verifyUsersHeader();
		/*Add a User */
		String fN =    fLib.getExcelData("Sheet3", 1,0);
		String lN =    fLib.getExcelData("Sheet3", 1,1);
		String email = fLib.getExcelData("Sheet3", 1,2);
		String uN =    fLib.getExcelData("Sheet3", 1,3);
		us.addAUser(fN, lN, email, uN);
		
		/* verify Opportunity Header */
		Opportunity op=PageFactory.initElements(driver, Opportunity.class);
		op.verifyInvoicesHeader();
		/*Add a Milestone */
		String modelName =    fLib.getExcelData("Sheet6", 1,0);
		String modelDesc =    fLib.getExcelData("Sheet6", 1,1);
	    op.addMilestone(modelName, modelDesc);
		
		/* verify Tracks Header */
		Tracks tra=PageFactory.initElements(driver, Tracks.class);
		tra.verifyTrackHeader();
		
		String trackName =    fLib.getExcelData("Sheet7", 1,0);
		String trackTag =     fLib.getExcelData("Sheet7", 1,1);
		String trackTasks =   fLib.getExcelData("Sheet7", 1,2);
		String trackCategory =fLib.getExcelData("Sheet7", 1,3);
		
		tra.addTracks(trackName, trackTag, trackTasks, trackCategory);
		
		/* verify Task Categories Header */
		Task_Category tc=PageFactory.initElements(driver, Task_Category.class);
		tc.verifyExportHeader();
		/*Add a name Category*/
		String nameCategory =    fLib.getExcelData("Sheet5", 1,0);
		tc.addCategory(nameCategory);
		
		/* verify Custom Fields Header */
		act.verifycustomHeader();
		
		/* verify Tags Header */
		Tags tg=PageFactory.initElements(driver, Tags.class);
		tg.verifytagHeader();
		
		/*Add a Tag */
		String Name =    fLib.getExcelData("Sheet4", 1,0);
		String Desc =    fLib.getExcelData("Sheet4", 1,1);
		tg.addTag(Name, Desc);
		
		
		/* verify Integration Header */
		Integration it=PageFactory.initElements(driver, Integration.class);
		it.verifyintegrationHeader();
		
		/* verify Trash Header */
		act.verifytrashHeader();
	}
}
