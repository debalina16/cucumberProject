/**
 * 
 */
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
public class ReadDataFromExcel {
/**
 * @param args
 * @throws Throwable
 */
public static void main(String[] args) throws Throwable {
/*data read fromn properties file*/	
/*FileInputStream fis=new FileInputStream("E:\\Java\\WebDriverApplication\\Data\\Tools.xlsx");
Workbook wb=WorkbookFactory.create(fis);
Sheet sh=wb.getSheet("Sheet1");
Row rw=sh.getRow(1);
String data=rw.getCell(2).getStringCellValue();
System.out.println(data);*/

FileInputStream fis=new FileInputStream("E:\\Java\\WebDriverApplication\\Data\\Tools.xlsx");
Workbook wb=WorkbookFactory.create(fis);
Sheet sh=wb.getSheet("Sheet2");
	for(int index=0;index<=sh.getLastRowNum();index++) 
	{
		Row row=sh.getRow(index); 
		String First=row.getCell(0).getStringCellValue();
		String SECOND=row.getCell(1).getStringCellValue();
		System.out.println(First+"\t"+SECOND);
	}
	wb.close();
 }
}
