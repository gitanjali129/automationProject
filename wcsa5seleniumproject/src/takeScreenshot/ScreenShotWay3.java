package takeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotWay3 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver cdriver = new ChromeDriver();
		cdriver.manage().window().maximize();
		cdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		cdriver.get("https://demo.guru99.com/test/drag_drop.html");
		File src = cdriver.getScreenshotAs(OutputType.FILE);
	    File dest = new File("./screenshot/guru2.png");
	    Files.copy(src, dest);
		
		
		
		
		

	}

}
  