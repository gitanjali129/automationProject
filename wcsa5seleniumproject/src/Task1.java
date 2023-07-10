import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	
		public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  WebDriver	driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.get("http://omayo.blogspot.com/");
		  Thread.sleep(2000);
		 String parentHandel = driver.getWindowHandle();
		 System.out.println(parentHandel);
		
//		WebElement element = driver.findElement(By.partialLinkText("Open a popup window"));
//		Point Loc = element.getLocation();
//		int Xaxis = Loc.getX();
//		int Yaxis = Loc.getY();
//	   JavascriptExecutor jse = (JavascriptExecutor)driver;
//	   jse.executeScript("window.scrollBy("+Xaxis+","+(Yaxis-80)+")");
//		element.click();
//		Set<String> childHandel = driver.getWindowHandles();
		
			driver.switchTo().window(parentHandel).close();
		

	}

}
