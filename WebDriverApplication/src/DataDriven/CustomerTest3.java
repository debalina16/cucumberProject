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
public class CustomerTest3 {
	/**
	 * @param args
	 * @throws Throwable
	 */
	public static void main(String[] args) throws Throwable {
		/* open the workbook in read mode,create cell and enter data */
		FileInputStream fis = new FileInputStream("E:\\Data\\Tools.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Row row = sh.getRow(0);
		Cell cel = row.getCell(2);
		cel.setCellValue("Participant");
		/* open same workbook in write mode */
		FileOutputStream fos = new FileOutputStream("E:\\\\Data\\\\Tools.xlsx");
		/* save the file */
		wb.write(fos);
		/* close the sheet */
		wb.close();
		System.out.println("Done");
	}
}