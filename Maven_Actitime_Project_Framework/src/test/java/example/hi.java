package example;
/**
 * 
 */


import org.testng.annotations.Test;

import main.BaseClassLib;
import main.FileLib;

/**
 * @author Debalina
 *
 */

public class hi extends BaseClassLib {
@Test
public void test() throws Throwable {
	System.out.println("hi");
	FileLib fb=new FileLib();
	String Name = fb.getExcelData("Sheet5", 1, 2);
	System.out.println(Name);
}
}
