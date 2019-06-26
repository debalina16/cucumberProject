/**
 * 
 */
package Project1;

import org.testng.annotations.Test;
import static org.junit.Assert.assertEquals;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.sun.glass.events.KeyEvent;

/**
 * @author Debalina
 *
 */
public class verifyPDFFile {
	private WebDriver d;

	@BeforeTest
	public void setUp() {
		/* login to website by using firefox browser */
		d = new FirefoxDriver();
		d.get("http://live.guru99.com/index.php/");
		/* Click on mobile submenu */
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void testSeventh() throws Throwable {
		FileLib flib = new FileLib();
		String eMail = flib.getExcelData("Sheet5", 10, 5);
		String pWd = flib.getExcelData("Sheet5", 10, 6);

		/* Click on My Account Link */
		d.findElement(By.xpath("//div[@class='account-cart-wrapper']/a/span[text()='Account']")).click();
		WebElement myaccOpt = d.findElement(By.xpath("//div[@id='header-account']/div"));
		WebElement target = d.findElement(By.xpath("//div[@id='header-account']/div/ul/li[@class='first']"));
		Actions act = new Actions(d);
		act.moveToElement(myaccOpt).click(target).perform();

		/* login by existing credentials */
		d.findElement(By.xpath("//input[@id='email']")).sendKeys(eMail);
		d.findElement(By.xpath("//input[@id='pass']")).sendKeys(pWd);
		d.findElement(By.xpath("//span[text()='Login']")).click();

		/* Click on My Orders */
		d.findElement(By.xpath("//a[text()='My Orders']")).click();

		/* click on view order */
		String orderNumRef = d.findElement(By.xpath("//td[text()='100009491']")).getText();
		String statusOfPurchase = d.findElement(By.xpath("//td[text()='100009491']/../td[@class='status']")).getText()
				.toUpperCase();
		System.out.println("Order Reference Number:" + orderNumRef +"====>Status:" + statusOfPurchase);
		
		d.findElement(By.xpath("//td[text()='100009491']/../td/span/a[text()='View Order']")).click();

		/* verify previously created order is displayed in Recent order table */
		String verifyPreviousOrder = d.findElement(By.xpath("//div[@class='page-title title-buttons']")).getText();
		System.out.println(verifyPreviousOrder);

		/* verify status is pending or not */
		try {
        assertEquals(verifyPreviousOrder.substring(19, 26), statusOfPurchase);
        System.out.println("Status is " + statusOfPurchase);
		}catch(Exception e) {
			System.out.println("Status is " + statusOfPurchase);;
		}
		
		/* Click on Print Order Link */
		d.findElement(By.xpath("//a[text()='Print Order']")).click();

		/*copy the file path*/
		StringSelection str = new StringSelection("C:\\Users\\Debalina\\Downloads\\data1.pdf");
		/*get toolkit object*/
		java.awt.Toolkit tool = java.awt.Toolkit.getDefaultToolkit();
		/*get Clipboard object*/
		java.awt.datatransfer.Clipboard mouse = tool.getSystemClipboard();
		/* copy the content in to mouse tool*/
		mouse.setContents(str, null);

		/*paste the file path*/
		Robot robot = new Robot();
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}
	@AfterTest
	public void tearDown() throws Exception {
		
		Thread.sleep(4000);
		/* logout */
		d.switchTo().window(d.getWindowHandle());
		d.findElement(By.xpath("//div[@class='account-cart-wrapper']/a/span[text()='Account']")).click();
		WebElement myaccOpt = d.findElement(By.xpath("//div[@id='header-account']/div"));
		WebElement target = d.findElement(By.xpath("//div[@id='header-account']/div/ul/li[@class=' last']"));
		Actions act = new Actions(d);
		act.moveToElement(myaccOpt).click(target).perform();
		d.quit();
		
	}

}
