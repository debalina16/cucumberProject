package pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyFacebookImg {
public static void main(String[] args) {
	WebDriver d=new FirefoxDriver();
	d.get("https://facebook.com");
	
	String x="//img[@src='https://static.xx.fbcdn.net/rsrc.php/v3/yi/r/OBaVg52wtTZ.png']";
	boolean status=d.findElement(By.xpath(x)).isDisplayed();
	
	System.out.println(status);
	
	if(status) {
		System.out.println("Pass");
	}else {
		System.out.println("Fail");
	}
	
	d.close();
}
}
