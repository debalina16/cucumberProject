package DataDriven;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * @author Debalina
 *
 */
public class CustomerTest1 {
	/**
	 * @param args
	 * @throws Throwable
	 */
	public static void main(String[] args) throws Throwable {
		/* get the java object of the physical file */
		FileInputStream fis = new FileInputStream("E:\\Data\\Tools.xlsx");
		/* open workbook in a read mode */
		Workbook wb = WorkbookFactory.create(fis);
		/* get the control of the sheet1 */
		Sheet sh = wb.getSheet("Sheet1");
		/* get the control of the row 1 */
		Row row = sh.getRow(1);
		/* get the control of the 2nd cell in the 1st row */
		Cell cel = row.getCell(2);
		/* read the data */
		String data = cel.getStringCellValue();
		System.out.println(data);
		/* close the sheet */
		wb.close();
	}
}
