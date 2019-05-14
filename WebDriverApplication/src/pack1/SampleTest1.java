package pack1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleTest1 {
	public static void main(String[] args) {
		FirefoxDriver d=new FirefoxDriver();//to launch a empty browser
		
		d.get("https://gmail.com");//navigate to any web application
		
		String currentPageTitle=d.getTitle();//capture current Page Title
		System.out.println(currentPageTitle);
		
		if(currentPageTitle.equals("Gmail")) //authenticate current page is correct or not
			{
			System.out.println("Pass");
	    }else 
			{
			System.out.println("Fail");
		}
		
		String currentPageUrl=d.getCurrentUrl();//capture current page url
		System.out.println(currentPageUrl);
		
		String browserSessionID=d.getWindowHandle();//capture webdriver launched browser session ID
		System.out.println(browserSessionID);
		
		String CurrentPageHtmlCode=d.getPageSource();//capture Current Page HTML Code
		System.out.println(CurrentPageHtmlCode);
		
		d.quit();//close the browser
	}
	

}
