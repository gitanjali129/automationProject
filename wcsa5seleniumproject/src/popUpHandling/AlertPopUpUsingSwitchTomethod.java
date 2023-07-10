package popUpHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpUsingSwitchTomethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/bhusare/Desktop/Selenium/AlertPopUp.html");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(2000);
	    Alert alt = driver.switchTo().alert();
	    //alt.accept();
	  //alt.dismiss();
	    System.out.println(alt.getText());
		
		
		
	}

}
