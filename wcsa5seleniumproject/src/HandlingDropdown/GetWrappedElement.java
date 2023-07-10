package HandlingDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElement {

	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("file:///C:/Users/bhusare/Desktop/Selenium/MultiSelectDropDown.html");
			WebElement multiSelectDD = driver.findElement(By.id("menu"));
			Select sel = new Select(multiSelectDD);
			WebElement allOpt = sel.getWrappedElement();
			System.out.println(allOpt.getText());


	}
		}


