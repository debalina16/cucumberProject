/**
 * 
 */
package ObjectRepo;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

/**
 * @author Debalina
 *
 */
public class HomeRepo {
	@FindBy(id="search-input-location")
	private WebElement searchBar;

	
public void datasearch() {
	searchBar.sendKeys("London",Keys.ENTER);
}
}
