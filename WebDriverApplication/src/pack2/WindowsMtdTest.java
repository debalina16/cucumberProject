package pack2;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WindowsMtdTest {
	public static void main(String[] args) {
		Scanner sd=new Scanner(System.in);
		System.out.println("Enter Browser:");
		
		String userInput=sd.nextLine();
		WebDriver w=null;
		
		if(userInput.equals("firefox")) {
			w=new FirefoxDriver();
		}else if(userInput.equals("chrome")){
		    w=new ChromeDriver();
	    }else if(userInput.equals("ie")) {
            w=new InternetExplorerDriver();
	    }   
         w.get("https://gmail.com");
	

}}
