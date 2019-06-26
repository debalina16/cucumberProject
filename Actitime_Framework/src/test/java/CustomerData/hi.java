/**
 * 
 */
package CustomerData;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import main.BaseClassLib;
import main.FileLib;
import object_Repository.Home;
import object_Repository.ProjectAndCustomer;
import object_Repository.createProject;
import object_Repository.createUser;

/**
 * @author Debalina
 *
 */
@Test
public class hi extends BaseClassLib{
public void test() throws Throwable {
	FileLib fLib = new FileLib();
	String fN = fLib.getExcelData("Sheet3", 2, 1);
	Home hp = PageFactory.initElements(driver, Home.class);
	hp.clickOnTaskImage();
	driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
	ProjectAndCustomer pac = PageFactory.initElements(driver, ProjectAndCustomer.class);
	pac.clickOnCreateProjBtn();
	pac.clickOnCreateUserImg();
	
	createUser cu = PageFactory.initElements(driver, createUser.class);
	
        
	
	
	Boolean flag=false;
	for(WebElement wb1:cu.clickOncustomerVerify()) 
    {
	try {
		Assert.assertTrue(wb1.getText().contains("Dipak"));
		flag=true;
		break;
	}catch(Exception e) {
		System.out.println("Not Found");
	}
   }    
	
	    		if(flag==true) 
	    		{
	    			System.out.println(fN+"is found==>Pass");
	    		
	    		}else 
	    		{
	    		System.out.println(fN+"is not found==>Fail");
	    		}
	        
        } 
}



