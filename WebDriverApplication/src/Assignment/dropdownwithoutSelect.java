package Assignment;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 * @author Debalina
 *
 */
public class dropdownwithoutSelect {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    WebDriver d=new FirefoxDriver();//to launch a empty browser
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.get("file:///E:/HTML/dropdown1.html");//navigate to any web application
	    String x="//select[@multiple='true']";
	    WebElement progLanguages = d.findElement(By.xpath(x));
	    List<WebElement> options = progLanguages.findElements(By.tagName("option"));
	    /*Selecting all index which is start from 'a'*/
	    for(WebElement wb:options) {
	    	if(wb.getText().charAt(0)=='a') {
	    		wb.click();
	    		
	    }}
	    
	   // options.get(1).click();
		
}}
