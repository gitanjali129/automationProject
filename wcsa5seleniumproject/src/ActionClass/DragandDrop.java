package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(1000);
         
		  WebElement src1 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
          WebElement target1 = driver.findElement(By.id("bank"));
          
           Actions act = new Actions(driver);
           act.dragAndDrop(src1, target1).perform();
         
           WebElement src2 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
           WebElement target2 = driver.findElement(By.id("loan"));
           act.dragAndDrop(src2, target2).perform();
       
          WebElement src3 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
          WebElement target3 = driver.findElement(By.id("amt7"));
          act.dragAndDrop(src3, target3).perform();
          
          WebElement src4 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
          WebElement target4 = driver.findElement(By.id("amt8"));
          act.dragAndDrop(src4, target4).perform();
          
          WebElement temp = driver.findElement(By.id("equal"));
          if(temp.isDisplayed())
          {
        	  driver.quit();
          }
          else
          {
        	  System.out.println("Exception");
          }
         	}

}
