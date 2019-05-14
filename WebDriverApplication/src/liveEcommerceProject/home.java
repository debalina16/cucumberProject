/**
 * 
 */
package liveEcommerceProject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * @author Debalina
 *
 */

public class home {
	public static void main(String[] args) {
		/* login to website by using firefox browser */
		WebDriver d = new FirefoxDriver();
		d.get("http://live.guru99.com/index.php/");
		/* verify home title */
		String expTitle = "Home page";
		String actTitle = d.getTitle();
		boolean flag = false;
		System.out.println(actTitle);
		if (actTitle.equals(expTitle)) {
			flag = true;
		} else {
			flag = false;
		}
		if (flag) {
			System.out.println("Title is same===>Pass");
		} else {
			System.out.println("Title is not same===>Fail");
		}
		/* Click on mobile submenu */
		d.findElement(By.xpath("//a[text()='Mobile']")).click();
		/* Mobile page title verify */
		String expTitleM = "Mobile";
		String actTitleM = d.getTitle();
		System.out.println(actTitleM);
		if (actTitleM.equals(expTitleM)) {
			flag = true;
		} else {
			flag = false;
		}
		if (flag) {
			System.out.println("Title is Mobile===>Pass");
		} else {
			System.out.println("Title is not Mobile===>Fail");
		}
		/* Sort by name */
		WebElement nameSort = d
				.findElement(By.xpath("//div[@class='category-products']/div/div/div[@class='sort-by']/select"));

		Select sel = new Select(nameSort);

		sel.selectByVisibleText("Name");
		/* sort all mobile name */
		String samsung = d.findElement(By.xpath("//div[@class='product-info']/h2/a[text()='Samsung Galaxy']"))
				.getText();
		String sony = d.findElement(By.xpath("//div[@class='product-info']/h2/a[text()='Sony Xperia']")).getText();
		String iphone = d.findElement(By.xpath("//div[@class='product-info']/h2/a[text()='IPhone']")).getText();

		ArrayList<String> act = new ArrayList<String>();

		act.add(samsung);
		act.add(iphone);
		act.add(sony);
		System.out.println(act + "===>Before Sorting");
		Collections.sort(act);
		System.out.println(act + "===>After Sorting");
		/* Click on Add to Cart option */
		d.findElement(By.xpath("//h2/a[text()='IPhone']/../../div/button")).click();

		/* close the Browser */
		d.close();

	}
}
