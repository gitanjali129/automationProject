package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ActitimeLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://127.0.0.1/login.do;jsessionid=cb05l5k4foldb");
 String actualTitleOfLoginPage=driver.getTitle();
     if(actualTitleOfLoginPage.equals("actiTIME - Login"))
    		 {
    	      System.out.println("Actual Title is match ,Test case is pass");
    	      driver.findElement(By.name("username")).sendKeys("admin");
    	      Thread.sleep(2000);
    	      driver.findElement(By.name("pwd")).sendKeys("manager");
    	      Thread.sleep(2000);
    	      driver.findElement(By.id("loginButton")).click();
    		 }
     else
     {
    	 System.out.println("Title is not match,Test case is fail");
     }
    String actualTitleOfHomePage=driver.getTitle();
    if(actualTitleOfHomePage.equals("actiTIME - Enter Time-Track"))
    {
    	System.out.println("Actual Title is match ,Test case is pass");
    	Thread.sleep(2000);
    	driver.findElement(By.linkText("Logout")).
    	
    }
    
    else
    {
    	 System.out.println("Title is not match,Test case is fail");
    }
     
     
	

	}

}
