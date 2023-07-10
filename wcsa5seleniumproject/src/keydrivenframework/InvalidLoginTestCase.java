package keydrivenframework;

import java.io.IOException;

import org.openqa.selenium.By;

public class InvalidLoginTestCase extends BaseTest {
//combination of datadriven framework and keyword driven framework
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		Flib fl = new Flib();
		int rc = fl.getLastRowCount(Excel_Path, "Ivalidcreds");
		for(int i=1;i<=rc;i++)
		{
			driver.findElement(By.name("username")).sendKeys(fl.readExcelData(Excel_Path, "Ivalidcreds", i,0));
			driver.findElement(By.name("pwd")).sendKeys(fl.readExcelData(Excel_Path, "Ivalidcreds", i, 1));
			driver.findElement(By.id("loginButton")).click();
			driver.findElement(By.name("username")).clear();
			
		}
		bt.closeBrowser();
		
		 
		

	}

}
