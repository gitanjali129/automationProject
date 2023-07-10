package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bookmyshow {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://in.bookmyshow.com/explore/home/pune");
			Thread.sleep(8000);
		
			driver.findElement(By.xpath("//div[@class='sc-fQejPQ jWuMjc']")).click();
			//Thread.sleep(2000);

	}

}
