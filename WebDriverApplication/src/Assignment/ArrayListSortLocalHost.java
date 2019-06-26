/**
 * 
 */
package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * @author Debalina
 *
 */
public class ArrayListSortLocalHost {
	public static void main(String[] args) {
		ArrayList<String> lst = new ArrayList<String>();
		lst.add("http://localhost/login.do");
		lst.add("admin");
		lst.add("manager");
		WebDriver driver = new FirefoxDriver();
		driver.get(lst.get(0));
		driver.findElement(By.name("username")).sendKeys(lst.get(1));
		driver.findElement(By.name("pwd")).sendKeys(lst.get(2));
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//div[text()='Tasks']")).click();
		driver.findElement(By.linkText("Projects & Customers")).click();
		WebElement custDrp = driver.findElement(By.xpath("//select[@name='selectedCustomer']"));
		Select sel = new Select(custDrp);
		/* get data from DropDown */
		List<WebElement> lst1 = sel.getOptions();
		ArrayList<String> ackLst = new ArrayList<String>();
		ArrayList<String> aftrSortLst = new ArrayList<String>();
		/* transfer the application drop down data in the new collection */
		for (int i = 0; i < lst1.size(); i++) {
			ackLst.add(lst1.get(i).getText());
			aftrSortLst.add(lst1.get(i).getText());
		}
		/* sort */
		Collections.sort(aftrSortLst);
		System.out.println(ackLst);
		System.out.println(aftrSortLst);

	}
}
