/**
 * 
 */
package StepDefinitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import PageObjects.LoginPagePOM;
import Utilities.ObjectUltilities;

/**
 * @author Debalina
 *
 */
public class BaseClass {
public WebDriver driver;
public LoginPagePOM lp;
public ObjectUltilities ol;
public Logger log;
}
