package webdrivermethods;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandel {

	
		public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  WebDriver	driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.get("http://omayo.blogspot.com/");
		  Thread.sleep(2000);
		 String parentHandel = driver.getWindowHandle();
		 System.out.println(parentHandel);
	}

}
