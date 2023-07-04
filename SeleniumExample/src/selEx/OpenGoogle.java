package selEx;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
	    		   "/home/mac/ADS/Chromedriver/107/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("www.google.com");
	}

}
