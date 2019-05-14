package object_Repository;
/**
 * 
 */


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Debalina
 *
 */
public class createCustomer {
	
	@FindBy(xpath="//input[@name='name']")
	private WebElement customerNameEdt;
	
	@FindBy(xpath="//textarea[@name='description']")
	private WebElement custDescEdt;
	
	@FindBy(xpath="//input[@class='hierarchy_element_wide_button']")
	private WebElement createCustomerBtn;
	
	public void createCustomerEdt(String CustomerNAme) {
		customerNameEdt.sendKeys(CustomerNAme);
		createCustomerBtn.click();
	}
	
	public void createCustomerEdt(String customerNAme,String customerDesc ) {
		customerNameEdt.sendKeys(customerNAme);
		custDescEdt.sendKeys(customerDesc);
		createCustomerBtn.click();
	}
  
}
