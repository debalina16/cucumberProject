/**
 * 
 */
package ObjectRepo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

import mainRepository.BaseClassLib;

/**
 * @author Debalina
 *
 */
public class SearchRepo {
	@FindBys(@FindBy(xpath = "//div[@class='listing-results-wrapper']/div[2]/a"))
	private List<WebElement> searchPrice;

	public void gatherPrice() {
		System.out.println(searchPrice.size());
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		for (int i = 0; i < searchPrice.size(); i++) {

			String s = searchPrice.get(i).getText();
			int s1 = Integer.parseInt(s.replaceAll("[\\,\\£\\^a-zA-Z]", "").trim());
			a1.add(s1);
		}
		System.out.println("List of Price of property is:");
		System.out.println(a1);
		java.util.Collections.sort(a1, java.util.Collections.reverseOrder());
		System.out.println("Decending order of Price of property is:");
		System.out.println(a1);

	}

	public void clickOn5thProperty(int prop) throws Exception {
				String fifthEle = searchPrice.get(prop).getText().replaceAll("[\\^a-zA-Z]", "").trim();
				System.out.println(prop+"th property price is "+fifthEle);
				String y="//div[@class='listing-results-wrapper']/div[2]/a[contains(text(),'"+fifthEle+"')]";
				WebDriverWait wait2 = new WebDriverWait(BaseClassLib.driver, 20);
				wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='listing-results-wrapper']/div[2]/a[contains(text(),'"+fifthEle+"')]")));
				//Thread.sleep(6000);
				BaseClassLib.driver.findElement(By.xpath("//div[@class='listing-results-wrapper']/div[2]/a[contains(text(),'"+fifthEle+"')]")).click();
				}
	
}
