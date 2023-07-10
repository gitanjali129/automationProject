package assignmentPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonassignment {

	
		
		public static void main(String[] args) throws InterruptedException, IOException, AWTException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  WebDriver	driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.get("https://www.amazon.in/");
		  Thread.sleep(2000);
		 WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		 ele.click();
		 ele.sendKeys("Samsung Mobile");
		 driver.findElement(By.id("nav-search-submit-button")).click();
		 driver.findElement(By.xpath("//span[text()='Samsung Galaxy M14 5G (Berry Blue, 6GB, 128GB Storage) | 50MP Triple Cam | 6000 mAh Battery | 5nm Octa-Core Processor | 12GB RAM with RAM Plus | Android 13 | Without Charger']")).click();
		Thread.sleep(2000);
		Set<String> add = driver.getWindowHandles();
		for(String wh:add)
		{
			driver.switchTo().window(wh);
		}
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[text()='Select delivery location']")).click();
		 driver.findElement(By.id("GLUXZipUpdateInput")).sendKeys("411033");
		 Thread.sleep(1000);
		Robot ro = new Robot();
		ro.keyPress(KeyEvent.VK_TAB);
		ro.keyRelease(KeyEvent.VK_TAB);
//		ro.keyPress(KeyEvent.VK_TAB);
//		ro.keyRelease(KeyEvent.VK_TAB);
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
		
//		 WebElement Pin = driver.findElement(By.id("GLUXZipUpdate-announce"));
//		 Pin.click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("a-autoid-23-announce")).click();
		Thread.sleep(2000);
		 driver.findElement(By.id("add-to-cart-button")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("attach-sidesheet-view-cart-button")).click();
		 if(driver.findElement(By.xpath("//h1[text()]")).isDisplayed())
		 {Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@value='Delete']")).click();
	     }

}}
