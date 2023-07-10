package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class quitMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://omayo.blogspot.com/");
	//Click in link for child browser
	driver.findElement(By.xpath("//a[text()=' open a popup window']")).click();
	//close parent as well as child browser
	 driver.quit();

	} 

}
