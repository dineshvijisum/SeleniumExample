package selEx;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"/home/mac/ADS/Chromedriver/107/chromedriver_linux64/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/select.xhtml");
		
		WebElement dropdown= driver.findElement(By.className("ui-selectonemenu"));
		
		Select select=new Select(dropdown);
		select.selectByIndex(1);
		Thread.sleep(3000);
		select.selectByVisibleText("Cypress");
		
		
		List<WebElement> listOptions=select.getOptions();
		int size=listOptions.size();
	    
		System.out.println(size);
		
		
	}

}
