package object_Repository;
/**
 * 
 */


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Debalina
 *
 */
public class Home {
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement taskImg;
	
	@FindBy(xpath="//div[text()='Users']")
	private WebElement userImg;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutLnk;
	
	public void clickOnTaskImage(){
		taskImg.click();
	}
	public void clickOnUSERImage(){
		userImg.click();
	}
	public void logout(){
		logoutLnk.click();
	}

}
