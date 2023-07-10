package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopprsstackLoginPage {
	

		public static void main(String[] args)throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
			 WebDriver driver= new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://shoppersstack.com/user-signin");
			 driver.findElement(By.id("Email")).sendKeys("gb123gb");
			 driver.findElement(By.id("Password")).sendKeys("kl9008o");
			 Thread.sleep(2000);
             driver.findElement(By.id("Login")).click();
 }
}