package assignmentPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkdinLoginPage {

	
		public static void main(String[] args)throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
			 WebDriver driver= new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://in.linkedin.com/");
			 driver.findElement(By.id("session_key")).sendKeys("gb123gb");
			 driver.findElement(By.id("session_password")).sendKeys("kl9008o");
			 Thread.sleep(2000);
             driver.findElement(By.id("sign-in-form__submit-btn")).click();			

		}

	}