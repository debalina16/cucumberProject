package pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchTest {
public static void main(String[] args) {
	WebDriver d=new FirefoxDriver();
	d.get("https://google.com");
	d.findElement(By.name("q")).sendKeys("Testing Jobs",Keys.ENTER);
}
}
