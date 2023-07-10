package keydrivenframework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLoginTestCase extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		
  BaseTest bt = new BaseTest();
   bt.openBrowser();
   Flib fli = new Flib();
   driver.findElement(By.name("username")).sendKeys(fli.readPropertyData("./data/config.properties", "Username"));
   Thread.sleep(2000);
   driver.findElement(By.name("pwd")).sendKeys(fli.readPropertyData("./data/c ,onfig.properties", "Password"));
   driver.findElement(By.id("loginButton")).click();
  
   bt.closeBrowser();
     
	}

}
