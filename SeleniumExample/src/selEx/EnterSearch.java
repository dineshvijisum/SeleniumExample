package selEx;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver", 
    		  "/home/mac/ADS/Chromedriver/107/chromedriver_linux64/chromedriver");
      WebDriver driver=new ChromeDriver();
      driver.get("http://www.google.co.in");
      
      //enter a search term
      //click the wikipedia link
      
      driver.findElement(By.name("q")).sendKeys("Selenium practise website"+Keys.ENTER);
      
      
      
	}

}
