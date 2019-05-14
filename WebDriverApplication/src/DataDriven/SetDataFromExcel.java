/**
 * 
 */
package DataDriven;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * @author Debalina
 *
 */
public class SetDataFromExcel {
public static void main(String[] args) throws Throwable {
	String data="E:\\Java\\WebDriverApplication\\Data\\Tools.xlsx";
	FileInputStream fis=new FileInputStream(data);
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet("Sheet1");
	Row row=sh.getRow(1);
	Cell cel=row.getCell(2);
	cel.setCellValue("Vodafone");
	FileOutputStream fos=new FileOutputStream(data);
	wb.write(fos);
	wb.close();
	System.out.println("done");
}
}
