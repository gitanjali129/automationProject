package robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task1 {

	//public static void main(String[] args) throws AWTException, InterruptedException {
		public static void main(String[] args) throws AWTException, InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		  driver.get("https://www.bluestone.com/");
		  driver.findElement(By.xpath("//span[text()='Not now']")).click();
		  Actions act= new Actions(driver);

		
		driver.findElement(By.xpath("//a[text()='Watch Jewellery ']")).click();  
		 Robot rob = new Robot();
		// Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[text()='Band']")).click();
		 //Thread.sleep(2000);
		WebElement target = driver.findElement(By.xpath("//div[@class='opt-title' and text()='Filter by']"));
		for(int i=0;i<=2;i++)
		{
		 act.doubleClick(target).perform();
		 act.clickAndHold(target).perform();
		}
		Thread.sleep(2000);
		 
		 rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_C);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_C);
		Thread.sleep(2000);
		driver.findElement(By.id("search_query_top_elastic_search")).click();
		Thread.sleep(2000);
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_V);
		;
	
	

	}

}
