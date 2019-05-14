package pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyFacebookRadioGroup {
	public static void main(String[] args) {
		WebDriver d=new FirefoxDriver();
		d.get("https://facebook.com");
		
		boolean fwb=d.findElement(By.id("u_0_9")).isSelected();
		boolean mwb=d.findElement(By.id("u_0_a")).isSelected();
		
		if(fwb==false && mwb==false) {
			System.out.println("is Unselected==> Pass");
		}else {
			System.out.println("is Selected==>Fail");
		}
		
		
}}
