/**
 * 
 */
package main;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * @author Debalina
 *
 */
public class FileLib {

	public String getPropertyKeyValue(String key) throws Throwable {
		FileInputStream fis=new FileInputStream("E:\\Java\\Capsulecrm_Project\\src\\main\\resources\\commonData.properties");
		Properties pObj=new Properties();
		pObj.load(fis);
		String value=pObj.getProperty(key);
		return value;
		
	}
	public String getExcelData(String sheetName,int rowNum,int celNum) throws Throwable {
		FileInputStream fis=new FileInputStream("E:\\Java\\Capsulecrm_Project\\src\\main\\resources\\Tools.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		Row rw=sh.getRow(rowNum);
		String data=rw.getCell(celNum).getStringCellValue();
		return data;
		
	}

}
