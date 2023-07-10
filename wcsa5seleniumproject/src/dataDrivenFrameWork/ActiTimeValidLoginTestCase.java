package dataDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeValidLoginTestCase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://127.0.0.1/login.do;jsessionid=11vd7etk4d6xk");
	//create object of flib(FileLibrary Class)
	Flib flib = new Flib();
	String validusername = flib.ReadExcelData("./data/ActiTimeLogin.xlsx", "validcreds", 1, 0);
	String validpassword = flib.ReadExcelData("./data/ActiTimeLogin.xlsx", "validcreds", 1, 1);
	driver.findElement(By.name("username")).sendKeys(validusername);
	driver.findElement(By.name("pwd")).sendKeys(validpassword);
	driver.findElement(By.id("loginButton")).click();
	
	}

}
