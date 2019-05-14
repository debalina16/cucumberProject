package DataDriven;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * @author Debalina
 *
 */
public class CustomerTest2 {
	/**
	 * @param args
	 * @throws Throwable
	 */
	public static void main(String[] args) throws Throwable {
		/* get the java object of the physical file */
		FileInputStream fis=new FileInputStream("E:\\Data\\Tools.xlsx");
		/*open workbook in read mode*/
		Workbook wb=WorkbookFactory.create(fis);
		/* get the control of the sheet2 */
		Sheet sh=wb.getSheet("Sheet2");
		/* get the control all the row */
		for(int i=0;i<=sh.getLastRowNum();i++) 
		{
			Row row=sh.getRow(i);
			String firstcell=row.getCell(0).getStringCellValue();
			String secondcell=row.getCell(1).getStringCellValue();
			
			System.out.println(firstcell+"\t"+secondcell);
		}
		/* close the sheet */
		wb.close();
	}
}
