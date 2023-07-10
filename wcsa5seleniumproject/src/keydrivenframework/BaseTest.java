package keydrivenframework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends Flib implements IautoConstant{
	
static WebDriver driver;
	public void openBrowser() throws IOException
	{
		
		Flib fil = new Flib();
		String bro = fil.readPropertyData("./data/config.properties" ,"Browser");
		
		if(bro.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do;jsessionid=91abfthgup01");
		}
		
		else if(bro.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/gecko.exe");
			 driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("http://127.0.0.1/login.do;jsessionid=91abfthgup01");
			
		}
		else if(bro.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
		    driver=new EdgeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   driver.get("http://127.0.0.1/login.do;jsessionid=91abfthgup01");
		}
		
		
	}
	
	public void closeBrowser()
	{
	driver.quit();
	}
}
