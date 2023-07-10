package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class easyjetSignin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easyjet.com/en");
		Thread.sleep(4000);
	//	driver.findElement(By.xpath("//button[@id='ensRejectAll']")).click();
		driver.findElement(By.id("ensRejectAll")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='navigation-sign-in-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='422a73e2-dc73-44f0-a458-d92da49b8502']")).sendKeys("gb123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='6838ac1e-0be0-4b4e-b676-5cd0c04fe41e']")).sendKeys("gb@13445");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
