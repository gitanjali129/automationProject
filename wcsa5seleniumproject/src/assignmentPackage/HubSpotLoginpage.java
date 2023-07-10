package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HubSpotLoginpage {
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://app.hubspot.com/login?hubs_signup-url=www.hubspot.com/products/crm&hubs_signup-cta=homepage-nav-login&hubs_content=www.hubspot.com/products/crm&hubs_content-cta=homepage-nav-login");
		 driver.findElement(By.id("username")).sendKeys("gb123gb");
		 driver.findElement(By.id("password")).sendKeys("kl9008o");
		 Thread.sleep(2000);
         driver.findElement(By.id("loginBtn")).click();
}}
