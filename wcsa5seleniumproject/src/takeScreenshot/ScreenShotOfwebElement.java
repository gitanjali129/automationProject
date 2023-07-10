package takeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotOfwebElement {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  WebDriver	driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("file:///C:/Users/bhusare/Desktop/Selenium/MultiSelectDropDown.html");
	  WebElement temp = driver.findElement(By.id("menu"));
	 File src = temp.getScreenshotAs(OutputType.FILE);
	 File dest = new File("./screenshot/flip3.png");
	 Files.copy(src, dest);
	}

	
}
