package HandlingDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Staticdropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/bhusare/Desktop/Selenium/MultiSelectDropDown.html");
		WebElement multiSelectDD = driver.findElement(By.id("menu"));
		Select sel = new Select(multiSelectDD);
		
		//To select using Index value
		sel.selectByIndex(0);
		
		//To Select using Visible Text
		sel.selectByVisibleText("Pav Bhaji");
		
		//To select using Value
		sel.selectByValue("v5");
		
		//To deselect using index value
		sel.deselectByIndex(2);
		
		//To deselect using visible text
		sel.deselectByVisibleText("Vada Pav");
		
		//To deselct using value
		sel.deselectByValue("v5");
		
		//To select Multiple options Using For loop
		for(int i=0;i<5;i++)
		{
			sel.selectByIndex(i);
			Thread.sleep(2000);
		}
		Thread.sleep(1000);
		//To Deselect Multiple options Using For loop
		for(int i=0;i<5;i++)
		{
			sel.deselectByIndex(i);
			Thread.sleep(2000);
		}
		
		
		           //or
		
		
		//To select all options using deslect all
		Thread.sleep(1000);
		sel.deselectAll();
		
	}

}
