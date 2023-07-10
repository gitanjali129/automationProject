package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageAssignment {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/login");
	 WebElement pwd = driver.findElement(By.id("id_userLoginId"));
	 pwd.sendKeys("gitanjali");
	 
	 WebElement pwd1 = driver.findElement(By.id("id_password"));
	 pwd1.sendKeys("gb@123");
	 Thread.sleep(2000);
	 
	 driver.findElement(By.className("btn login-button btn-submit btn-small")).click();
	
	 
	 
	 
	 
	 
	 
	 
	}
	

	}


