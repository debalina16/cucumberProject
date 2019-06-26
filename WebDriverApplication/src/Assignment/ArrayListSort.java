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
public class ArrayListSort {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement wb=driver.findElement(By.id("month"));
		Select sel=new Select(wb);
		/*get data from DropDown*/
		List<WebElement> lst=sel.getOptions();
		/*Create 2 new Array List*/
		ArrayList<String> actlst=new ArrayList<String>();
		ArrayList<String> aftsort=new ArrayList<String>();
		/*transfer the application drop down data in the new collection*/
		for(int i=0;i<lst.size();i++) {
			actlst.add(lst.get(i).getText());
			aftsort.add(lst.get(i).getText());
		}
		/*sort*/
		Collections.sort(aftsort);
		System.out.println(actlst);
		System.out.println(aftsort);
	}

}
