package assignmentPackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpotifyLoginPage {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://accounts.spotify.com/en/login?continue=https");
		 driver.findElement(By.id("login-username")).sendKeys("gb123gb");
		 driver.findElement(By.id("login-password")).sendKeys("kl9008o");
		 Thread.sleep(2000);
		 driver.findElement(By.id("login-button")).click();
		

	}

}
