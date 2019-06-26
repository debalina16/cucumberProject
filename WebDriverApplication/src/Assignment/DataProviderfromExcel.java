/**
 * 
 */
package Assignment;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.actitime.genericlib.FileLib;


/**
 * @author Debalina
 *
 */
public class DataProviderfromExcel {
@Test(dataProvider="getDataForAddToCartTest")
public void addToCart(String productName,String qty) {
	System.out.println("Buy Product===>"+productName+"===Qty==="+qty);
}
@DataProvider(name="getDataForAddToCartTest")
public Object[][] getDataForAddToCartTest() throws Throwable{
	FileLib lb=new FileLib();
	int rowCount=lb.getRowCount("Sheet2");
	
	System.out.println(rowCount);
	Object[][] objArr=new Object[rowCount][2];
	for(int i=0;i<rowCount;i++) {
		objArr[i][0]=lb.getExcelData("Sheet2", i, 0);
		objArr[i][1]=lb.getExcelData("Sheet2", i, 1);
	}
	return objArr;
	
}

}
