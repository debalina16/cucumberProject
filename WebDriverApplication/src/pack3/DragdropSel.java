package pack3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragdropSel {

	public static void main(String[] args) {
		WebDriver d=new FirefoxDriver();
		d.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
		WebElement srcWb=d.findElement(By.id("draggable"));
		WebElement desWb=d.findElement(By.id("droptarget"));
		
		Actions act=new Actions(d);
		
		//act.clickAndHold(srcWb).moveToElement(desWb).release().build().perform();
		
		act.dragAndDrop(srcWb, desWb).perform();
	}
}
