package HandlingDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUnderstandOprtationalMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/bhusare/Desktop/Selenium/MultiSelectDropDown.html");
		WebElement multiSelectDD = driver.findElement(By.id("menu"));
		Select sel = new Select(multiSelectDD);
		
		// isMultiple Method
		System.out.println(sel.isMultiple());
		/*List<WebElement> dropdownOptions = sel.getOptions();
		for(int i=0;i<dropdownOptions.size();i++)
		{
			String options = dropdownOptions.get(i).getText();
			System.out.println(options);
			Thread.sleep(2000);
		}*/
		
		List<WebElement> Ops = sel.getOptions();
		for(WebElement we:Ops)
		{
			String textOfOps = we.getText();
			System.out.println(textOfOps);
			Thread.sleep(1000);
		}

	}

}
