package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeMethod {

	public static void main(String[] args)throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	Thread.sleep(2000);
	driver.get("https://www.instagram.com/");
	String pageTitle =driver.getTitle();
	System.out.println(pageTitle);
	String pageSource =driver.getPageSource();
	System.out.println(pageSource);
	String CurrentUrl =driver.getCurrentUrl();
	System.out.println(CurrentUrl);
	
	

	}

}
