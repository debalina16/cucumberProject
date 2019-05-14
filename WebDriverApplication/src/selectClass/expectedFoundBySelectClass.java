/**
 * 
 */
package selectClass;

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
public class expectedFoundBySelectClass {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///E:/HTML/dropdown.html");
	String expVal="Shell Scripting";
	boolean flag=false;
	/* Indentify multiselect Dropdown*/
	WebElement wb= driver.findElement(By.xpath("//select[@multiple='true']"));
	/*Create a object of select class*/
	Select sel=new Select(wb);
	/*get all option from dropdown in runtime*/
	List<WebElement> list=sel.getOptions();
	for(int i=0;i<=list.size();i++) 
	{
		/* capture all option for dropdown using loop*/
		String  actVal=list.get(i).getText();
		/*check expected value is available in collection using if block*/
			if(actVal.equals(expVal)) 
			{
				sel.selectByVisibleText(expVal);
				flag=true;
				break;
			}
	}
	if(flag==true) 
	{
		System.out.println(expVal+"==>is available==>Pass");
	}
	else 
	{
		System.out.println(expVal+"==>is not available==>Fail");
	}
  }	
}
