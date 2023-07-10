package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoldCoin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=CjwKCAjw-b-kBhB-EiwA4fvKrGk-qZZTejkUv5EzoHruW9wWb5Zl4jdzkdQJM5ubPAdFs9mBT1i2MRoCilMQAvD_BwE");
        WebElement target = driver.findElement(By.id("goldCoins"));
	   Actions act=new Actions(driver);
	 
       act.moveToElement(target).perform();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//span[@data-p='gold-coins-weight-1gms,m']")).click();
       Thread.sleep(2000);
      WebElement temp = driver.findElement(By.xpath("//div[@class='mousetrap']"));
      Thread.sleep(2000);
       if(temp.isDisplayed())
       {   Thread.sleep(2000);
    	   driver.quit();
    	   
       }
       else
       {
    	   System.out.println("Exception");
       }
       
	}

}
