package dataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
 
	        // to store generic reusable methods
			//all the method are non static
	public String ReadExcelData(String excelpath,String sheetname,int rowcount,int cellcount) throws EncryptedDocumentException, IOException
	{
		
			 FileInputStream fis=new FileInputStream(excelpath);//provide the path of the file
		   Workbook wb = WorkbookFactory.create(fis);//make the file ready to read
		  Sheet sheet = wb.getSheet(sheetname);//get into sheet
		 Row row = sheet.getRow(rowcount);
		Cell cell = row.getCell(cellcount);
		String userdata = cell.getStringCellValue();
		   return userdata;
		}
	//it is use to count the lastrowcount
	public int getLastRowCount(String excelpath,String sheetname) throws EncryptedDocumentException, IOException
	{
		
		FileInputStream fis=new FileInputStream(excelpath);
		
	 Workbook wb = WorkbookFactory.create(fis);//make the file ready to read
	  Sheet sheet = wb.getSheet(sheetname);//get into sheet
	 int rc = sheet.getLastRowNum();
	 return rc;

	}
	//it is used to write a data into excel sheet
	
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
	}
	
	
	


