package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestCase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do;jsessionid=11vd7etk4d6xk");
		//read the data from excelsheet
		//for username
		FileInputStream fis = new FileInputStream("./data/ActiTimeLogin.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		 
		Sheet sheet = wb.getSheet("validcreds");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String userdata = cell.getStringCellValue();//read the value from cell
		//for password
		FileInputStream fis1 = new FileInputStream("./data/ActiTimeLogin.xlsx");
		Workbook wb1 = WorkbookFactory.create(fis1);
		 
		Sheet sheet1 = wb1.getSheet("validcreds");
		Row row1 = sheet1.getRow(1);
		Cell cell1 = row1.getCell(1);
		String passdata = cell1.getStringCellValue();//read the value from cell
		
		driver.findElement(By.name("username")).sendKeys(userdata);
		driver.findElement(By.name("pwd")).sendKeys(passdata);
		driver.findElement(By.id("loginButton")).click();

	}

}
