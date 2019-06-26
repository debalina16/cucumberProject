package mainRepository;

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
	FileInputStream fis=new FileInputStream("E:\\Java\\zoopla_Frame_Work\\src\\main\\resources\\commonData.properties");
	Properties pObj=new Properties();
	pObj.load(fis);
	String value=pObj.getProperty(key);
	return value;
	
}

}
