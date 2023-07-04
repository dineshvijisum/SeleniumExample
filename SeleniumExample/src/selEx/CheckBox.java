package selEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"/home/mac/ADS/Chromedriver/107/chromedriver_linux64/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/checkbox.xhtml");
		WebElement checkBox=driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt89\"]/div[2]"));
		checkBox.click();
		
		WebElement check=driver.findElement(By.xpath(null));
		boolean check1=check.isSelected();
		System.out.println(check1);
		
		WebElement firstElement=driver.findElement(By.xpath(null));
		if(firstElement.isSelected()) {
			firstElement.click();
		}
		
		WebElement secondElemet=driver.findElement(By.xpath(null));
		if(secondElemet.isSelected()) {
			secondElemet.click();
		}

	}

}
