package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://in.puma.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Men']")).click();
		Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0,20000)");
				
		
	  Point newElement = driver.findElement(By.xpath("//img[@loading='lazy' and @sizes='(max-width: 539px) 50vw, (min-width: 540px) and (max-width: 1023px) 33vw, (min-width: 1024px) 25vw' and @title='BMW M Motorsport SPEEDFUSION Unisex Sneakers, Cool Cobalt-PUMA Black' and @class='']")).getLocation();
	  int Xaxis=newElement.getX();
	  int Yaxis=newElement.getY();
	  jse.executeScript("window.scrollBy("+Xaxis+","+(Yaxis)+")");
	  
		
		/*if(temp.isDisplayed())
		{	Thread.sleep(2000);
			driver.quit();
		}
		else
		{
			jse.executeScript("window.scrollBy(0,5000)");
		}*/
			
		   }
	}
