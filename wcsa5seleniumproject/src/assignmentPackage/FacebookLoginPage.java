package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginPage {


public static void main(String[] args)throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
	 WebDriver driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/login/");
	 driver.findElement(By.id("email")).sendKeys("gb123gb");
	 driver.findElement(By.id("pass")).sendKeys("kl9008o");
	 Thread.sleep(2000);
     driver.findElement(By.id("loginbutton")).click();
}}