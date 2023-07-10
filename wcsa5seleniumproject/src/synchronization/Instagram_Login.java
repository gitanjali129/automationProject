package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram_Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("https://www.instagram.com/");
          Thread.sleep(2000);
          driver.findElement(By.xpath("//input[@name='username']")).sendKeys("manager");
          driver.findElement(By.xpath("//input[@name='password']")).sendKeys("man123@");
          driver.findElement(By.xpath("//div[text()='Log in']")).click();
	}

}
