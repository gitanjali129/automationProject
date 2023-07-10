package keydrivenframework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	public String readExcelData(String excelpath,String sheetname,int rowcount,int cellcount) throws EncryptedDocumentException, IOException
	{
	        FileInputStream	fib=new FileInputStream(excelpath);
            Workbook wb=WorkbookFactory.create(fib);
            Sheet sheet = wb.getSheet(sheetname);
           Row row = sheet.getRow(rowcount);
          Cell cell = row.getCell(cellcount);
          String userdata = cell.getStringCellValue();
          return userdata;
          }
		
public int getLastRowCount(String excelpath,String sheetname) throws EncryptedDocumentException, IOException
{
	FileInputStream fil = new FileInputStream(excelpath);
	Workbook wb = new WorkbookFactory().create(fil);
	Sheet sheet = wb.getSheet(sheetname);
	int rc = sheet.getLastRowNum();
	return rc;
	
	}


public void writeExcelData(String excelpath,String sheetname,int rowcount,int cellcount,String data) throws EncryptedDocumentException, IOException
{
	FileInputStream fis = new FileInputStream(excelpath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet(sheetname);
	Row row = sheet.getRow(rowcount);
	Cell cell = row.createCell(cellcount);
	cell.setCellValue(data);
	FileOutputStream fos = new FileOutputStream(excelpath);
	wb.write(fos);
	} 

public String readPropertyData(String filepath,String keyname) throws IOException
{ FileInputStream fil = new FileInputStream(filepath);

  Properties pro = new Properties();
 pro.load(fil);
String data = pro.getProperty(keyname);
return data;

	}
}


