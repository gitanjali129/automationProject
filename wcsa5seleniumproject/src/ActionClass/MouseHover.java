package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/jewellery/watch+jewellery.html");
		WebElement target = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
		Actions act=new Actions(driver);
		act.moveToElement(target).perform();
		WebElement dis = driver.findElement(By.xpath("//a[text()='Band']"));
		if(dis.isDisplayed())
		{
			driver.quit();
		}
		else
		{
			System.out.println("Exception");
		}

	}

}
