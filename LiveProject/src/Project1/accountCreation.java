/**
 * 
 */
package Project1;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author Debalina
 *
 */
public class accountCreation {
	private WebDriver d;
	FileLib flib = new FileLib();

	@BeforeTest
	public void setUp() {
		/* login to website by using firefox browser */
		d = new FirefoxDriver();
		d.get("http://live.guru99.com/index.php/");
		/* Click on mobile submenu */
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void testFifth() throws Throwable {
		String fName = flib.getExcelData("Sheet5", 10, 2);
		String mName = flib.getExcelData("Sheet5", 10, 3);
		String lName = flib.getExcelData("Sheet5", 10, 4);
		String eMail = flib.getExcelData("Sheet5", 10, 5);
		String pWd = flib.getExcelData("Sheet5", 10, 6);
		String eMailShare = flib.getExcelData("Sheet5", 13, 2);
		String eMailMsg = flib.getExcelData("Sheet5", 13, 3);

		/* Click on My Account Link */
		d.findElement(By.xpath("//div[@class='account-cart-wrapper']/a/span[text()='Account']")).click();
		WebElement myaccOpt = d.findElement(By.xpath("//div[@id='header-account']/div"));
		WebElement target = d.findElement(By.xpath("//div[@id='header-account']/div/ul/li[@class='first']"));

		Actions act = new Actions(d);
		act.moveToElement(myaccOpt).click(target).perform();
		/* click on Create an Account Button */
		d.findElement(By.xpath("//span[text()='Create an Account']")).click();

		/* Enter Data for user creation */
		d.findElement(By.xpath("//input[@id='firstname']")).sendKeys(fName);
		d.findElement(By.xpath("//input[@id='middlename']")).sendKeys(mName);
		d.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lName);
		d.findElement(By.xpath("//input[@id='email_address']")).sendKeys(eMail);
		d.findElement(By.xpath("//input[@id='password']")).sendKeys(pWd);
		d.findElement(By.xpath("//input[@id='confirmation']")).sendKeys(pWd);
		d.findElement(By.xpath("//span[text()='Register']")).click();

		/* Registration verify */
		String verifyUser = d.findElement(By.xpath("//p[@class='hello']")).getText();
		Boolean status = verifyUser.contains(fName);
		try {	    	
			Assert.assertTrue(status);
		    } catch (Exception e) {
		    	e.printStackTrace();	    	
		    }	
		
		/* Click on TV link */
		d.findElement(By.xpath("//a[text()='TV']")).click();
		/* click on Add to Wishlist link for LG Tv */
		String x = "//div[@class='product-info']/h2/a[text()='LG LCD']/../../div[@class='actions']/ul/li/a[text()='Add to Wishlist']";
		d.findElement(By.xpath(x)).click();
		/* click on Share Wishlist Button */
		d.findElement(By.xpath("//span[text()='Share Wishlist']")).click();
		/* share wishlist to email and message */
		d.findElement(By.xpath("//textarea[@id='email_address']")).sendKeys(eMailShare);
		d.findElement(By.xpath("//textarea[@id='message']")).sendKeys(eMailMsg);
		d.findElement(By.xpath("//button[@title='Share Wishlist']")).click();
		/* Wishlist share verification */
		String wishListStatusExt = "Your Wishlist has been shared.";
		String wishListStatusAct = d.findElement(By.xpath("//ul/li[@class='success-msg']/ul/li/span")).getText();
		 try {	    	
			     Assert.assertEquals(wishListStatusAct, wishListStatusExt);
			    } catch (Exception e) {
			    	e.printStackTrace();	    	
			    }	
		    	    
		
	}

	@AfterTest
	public void close() {
		/* close the Browser */
		d.close();
	}

}
