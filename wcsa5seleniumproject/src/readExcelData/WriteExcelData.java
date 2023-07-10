package readExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.examples.WorkbookProperties;

import dataDrivenFrameWork.Flib;

public class WriteExcelData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
   FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
   Workbook wb = WorkbookFactory.create(fis);
  Flib flib = new Flib();
 
   flib.writeExcelData("./data/TestData.xlsx", "IPL", 2, 2, "gb");
 //  Sheet sheet = wb.getSheet("IPL");
//   Row row = sheet.getRow(1);
//   //Create the cell by using row [I]
//   Cell cell = row.createCell(2);
//   //write the data into cell
  
  
	}

}
