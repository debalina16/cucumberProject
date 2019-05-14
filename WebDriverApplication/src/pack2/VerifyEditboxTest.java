package pack2;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyEditboxTest {
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.get("https://gmail.com");
	
	WebElement wb=d.findElement(By.id("identifierId"));
	
	org.openqa.selenium.Dimension dem=wb.getSize();
	System.out.println("Height of Email editbox:"+dem.getHeight());
	System.out.println("Height of Email editbox:"+dem.getWidth());
	
	Point p=wb.getLocation();
	System.out.println("X-Coordinate of Email:"+p.getX());
	System.out.println("Y-Coordinate of Email:"+p.getY());
	
	String expVal="Email or phone";
	String actVal=wb.getAttribute("aria-label");
	
	System.out.println(actVal);
	if(expVal.equals(actVal)) {
		System.out.println("Pass");
	}else {
		System.out.println("Fail");
	}
	
	wb.sendKeys("Selenium");
	System.out.println(wb.getAttribute("value"));
	
}
}
