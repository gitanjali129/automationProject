package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class demo {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

	for(int i=0;i<=10;i++) {
		FileInputStream fil = new FileInputStream("./data/TestData.xlsx");// provid the path
		Workbook wb = WorkbookFactory.create(fil);//make the file for ready to read
		//from Apachepoi package
		Sheet sheet = wb.getSheet("IPL");//get into the sheet
		Row row = sheet.getRow(i);
		//get into the desired row
		for(int j=0;j<=1;j++)
		{
		Cell cell = row.getCell(j);//get into the desired cell
		String data = cell.getStringCellValue();//read the data from cell
		System.out.print(data +":");
		
		Thread.sleep(2000);
		}
		System.out.println();}
		

}}
