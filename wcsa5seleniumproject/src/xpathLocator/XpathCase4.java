package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCase4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		Thread.sleep(2000);
		driver.findElement(By.xpath(null)).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath(null)).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath(null)).click();
		
		
	}

}
