package HomeWork;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
  
	public static void main(String[] args)throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/bhusare/Desktop/Selenium/LoginPage.html");
		driver.findElement(By.id("i1")).sendKeys("gitanjali");
		driver.switchTo().frame("framename");
		driver.findElement(By.id("i2")).sendKeys("gb@123");
		Thread.sleep(2000);
		driver.findElement(By.id("i2")).clear();	
		driver.switchTo().defaultContent();
		driver.findElement(By.id("i1")).clear();
		driver.close();
		
}}
