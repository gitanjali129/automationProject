package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
       WebDriver driver=  new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.google.com/");
       driver.findElement(By.cssSelector("input[id='email']")
       Thread.sleep(2000);
       driver.findElement(By.className("lNPNe")).click();
       
	}
}}

