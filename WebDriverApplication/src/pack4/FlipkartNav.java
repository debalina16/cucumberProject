
	package pack4;

	import java.util.concurrent.TimeUnit;
    import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;

	public class FlipkartNav {

		public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();//to launch a empty browser
		
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		d.navigate().to("https://flipkart.com");//navigate to any web application
		
		//d.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		Actions act=new Actions(d);
		
		act.sendKeys(Keys.ESCAPE).perform();
		
		d.findElement(By.name("q")).sendKeys("IPhone10",Keys.ENTER);
		
		WebElement wb=d.findElement(By.xpath("//span[contains(text(),'Showing')]"));
		
		String contAct=wb.getText();
		
		System.out.println(contAct);
		
		
		
	}}


