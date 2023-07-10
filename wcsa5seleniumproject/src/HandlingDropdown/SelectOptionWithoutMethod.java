package HandlingDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOptionWithoutMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/bhusare/Desktop/Selenium/SingleSelectDropdown.html");
		WebElement multiSelectDD = driver.findElement(By.id("menu"));
		//System.out.println(multiSelectDD.getText());
	

	Select sel = new Select(multiSelectDD);
		List<WebElement> Ops = sel.getOptions();
		/*for(int i=0;i<Ops.size();i++)
		{
			 Ops.get(i).click();
			 Thread.sleep(1000);
			 
		}
		for(int i=0;i<Ops.size();i++)
		{
			 Ops.get(i).click();
			 Thread.sleep(1000);
			 
		}	*/
		
		for(WebElement option:Ops)
		{ 
			if (option.getText().equals("Pani Puri")) {
				Thread.sleep(2000);
				option.click();
				break;
			} 
			
		}
}
}


