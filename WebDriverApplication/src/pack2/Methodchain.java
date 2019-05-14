package pack2;

class FirefoxDriver{
	Webelement findelement(String locator) {
		System.out.println("find element===>"+locator);
		Webelement w1=new Webelement();
		return w1;
	}
}

class Webelement{
	void sendKeys(int data) {
		System.out.println("pass data===>"+data);
	}
}

public class Methodchain {
public static void main(String[] args) {
	FirefoxDriver d1=new FirefoxDriver();
	//d1.findelement("editbox").sendKeys(34);
	Webelement s1=d1.findelement("Selenium");
	s1.sendKeys(23);
}

}

