import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class NotificationPopUpUsingOptionsClass {

	public static void main(String[] args) {
		//static WebDriver driver;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the browserValue");
		String browserValue = sc.next();
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--disable-notifications");
			WebDriver	driver=new ChromeDriver(co);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.easemytrip.com/");
		}
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			 FirefoxOptions fo = new FirefoxOptions();
			fo.addArguments("--disable-notifications");
			WebDriver	driver=new FirefoxDriver(fo);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.easemytrip.com/");
			
		}
		
		
	}

}
