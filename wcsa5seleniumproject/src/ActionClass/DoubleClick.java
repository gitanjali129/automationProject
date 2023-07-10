package ActionClass;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
      driver.get("http://gb-laptop-225v5h2c/login.do");
      Thread.sleep(1000);
      driver.findElement(By.name("username")).sendKeys("admin");
      Thread.sleep(1000);
      driver.findElement(By.name("pwd")).sendKeys("manager");
      Thread.sleep(1000);
      driver.findElement(By.id("loginButton")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//div[text()='Settings']/ancestor::a")).click();
     Thread.sleep(2000);
      driver.findElement(By.xpath(" //a[text()='Logo & Color Scheme']")).click();
      Thread.sleep(1000);
      driver.findElement(By.xpath("//input[@id='uploadNewLogoOption']")).click();
      Thread.sleep(1000);
    WebElement target = driver.findElement(By.xpath("//input[@name='formCustomInterfaceLogo.logo']"));
   Actions act = new Actions(driver);  
   act.doubleClick(target).perform();
   
    File file = new File("./autoitPrograms/FileUpload.exe");
    String abPath = file.getAbsolutePath();
    Runtime.getRuntime().exec(abPath);
    
      
  	
	}

}
