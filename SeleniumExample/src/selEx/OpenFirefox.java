package selEx;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.grcko.driver", "");
		WebDriver driver=new FirefoxDriver();
		driver.get(null);
		driver.quit();

	}

}
