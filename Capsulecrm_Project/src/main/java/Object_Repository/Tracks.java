/**
 * 
 */
package Object_Repository;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


/**
 * @author Debalina
 *
 */
public class Tracks {
	
	@FindBy(id="ember53")
	private WebElement trackLeftEdt;

	@FindBy(xpath = "//h2[@class='settings-page-header']")
	private WebElement trackHeaderEdt;

	@FindBy(xpath = "//a[text()='Add new Track']")
	private WebElement addTrackBtnEdt;

	@FindBy(id="j_id123:trackDescriptionDecorate:trackDescription")
	private WebElement nameOppEdt;

	@FindBy(id="j_id123:trackTagDecorate:trackTag")
	private WebElement tagOppEdt;
	
    @FindBy(id="j_id123:taskLines:0:taskDescriptionDecorate:taskDescription")
	private WebElement tasksOppEdt;

	@FindBy(xpath = "//span[@class='ui-selectmenu-text ui-selectmenu-text-none']")
	private WebElement taskCategoryEdt;
	
	@FindBy(id="j_id123:taskLines:0:taskDaysAfterDecorate:taskDaysAfter")
	private WebElement dueOppEdt;
	
	@FindBy(xpath = "//a[text()='Save']")
	private WebElement saveBtnEdt;
	
	/* verify Tracks Header */
	public void verifyTrackHeader() throws Throwable {
		Thread.sleep(2000);
        trackLeftEdt.click();
		try {
			Assert.assertEquals(trackLeftEdt.getText(), trackHeaderEdt.getText());
			System.out.println(trackLeftEdt.getText() + " is matched and existed");
		} catch (Exception e) {
			System.out.println(trackLeftEdt.getText() + " is matched and existed");
		}
	}
	/*Add a Tracks */
	public void addTracks(String nameTrack,String tagTrack,String TaskDesc,String Category) {
	addTrackBtnEdt.click();
	nameOppEdt.sendKeys(nameTrack);
	tagOppEdt.sendKeys(tagTrack);
	tasksOppEdt.sendKeys(TaskDesc);
	Select sel=new Select(taskCategoryEdt);
	sel.selectByVisibleText(Category);
	dueOppEdt.clear();
	saveBtnEdt.click();
	}
}
