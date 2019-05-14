package main;

/**
 * 
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * @author Debalina
 *This class contains file related methods,which is used to read the data from excel and properties file
 */
public class FileLib {
/**
 * Its used get the property key value from commonData.properties
 * @param key
 * @return
 * @throws Throwable
 */
public String getPropertyKeyValue(String key) throws Throwable {
	FileInputStream fis=new FileInputStream("E:\\Java\\WebDriverApplication\\Data\\commonData.properties");
	Properties pObj=new Properties();
	pObj.load(fis);
	String value=pObj.getProperty(key);
	return value;
	
}

/**
 * Its used to read data from Excel Workbook,based on user argument
 * @param sheetName
 * @param rowNum
 * @param celNum
 * @return
 * @throws Throwable
 */
public static String getExcelData(String sheetName,int rowNum,int celNum) throws Throwable {
	FileInputStream fis=new FileInputStream("E:\\Java\\WebDriverApplication\\Data\\Tools.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet(sheetName);
	Row rw=sh.getRow(rowNum);
	String data=rw.getCell(celNum).getStringCellValue();
	return data;
	
}
/**
 * used to write data back to excel based on user argument
 * @param sheetName
 * @param rowNum
 * @param celNum
 * @param data
 * @throws Throwable
 */
public void setExcelData(String sheetName,int rowNum,int celNum,String data) throws Throwable {
	FileInputStream fis=new FileInputStream("E:\\Java\\WebDriverApplication\\Data\\Tools.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet(sheetName);
	Row rw=sh.getRow(rowNum);
	Cell cell=rw.createCell(celNum);
	cell.setCellValue(data);
	FileOutputStream fos=new FileOutputStream("E:\\Java\\WebDriverApplication\\Data\\Tools.xlsx");
	wb.write(fos);
	wb.close();
 }
}
