package frame;

import java.awt.AWTException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task1 {
 
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	  driver.get("https://www.bluestone.com/");
	  driver.findElement(By.xpath("//span[text()='Not now']")).click();
	 Thread.sleep(2000);
	  
	driver.switchTo().frame("fc_widget");
	//Thread.sleep(2000);
//	WebDriverWait explicit = new WebDriverWait(driver, Duration.ofSeconds(30));
//	explicit.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class,'d-hotl') and@role='button']"))).click();
	
	driver.findElement(By.id("chat-icon")).click();
	Thread.sleep(2000);
	//again switch the control back to main webpage
	driver.switchTo().defaultContent();
	driver.findElement(By.id("chat-fc-name")).sendKeys("Gitanjali");
	Thread.sleep(1000);
	driver.findElement(By.id("chat-fc-email")).sendKeys("gitanjaligitanjali2017@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.id("chat-fc-phone")).sendKeys("9834268356");
	Thread.sleep(1000);
	//driver.findElement(By.xpath("//a[text()='Start Chat']")).click();
	
	  
}
}
