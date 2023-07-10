package robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyPress {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  WebDriver	driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://www.flipkart.com/");
	  driver.findElement(By.xpath("//button[text()='✕']")).click();
	  Thread.sleep(2000);
	  Robot rob = new Robot();
	  
	  rob.keyPress(KeyEvent.VK_CONTROL);
	  rob.keyPress(KeyEvent.VK_P);
	  
	  rob.keyRelease(KeyEvent.VK_CONTROL);
	  rob.keyRelease(KeyEvent.VK_P);
	  Thread.sleep(1000);
	  rob.keyPress(KeyEvent.VK_TAB);
	  rob.keyRelease(KeyEvent.VK_TAB);
	  Thread.sleep(1000);
	  rob.keyPress(KeyEvent.VK_ENTER);
	  rob.keyRelease(KeyEvent.VK_ENTER);
	  
	

	}

}
