package selEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"/home/mac/ADS/Chromedriver/107/chromedriver_linux64/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/radio.xhtml;jsessionid=node0ej6pg87uy3ihbhhtix6ffxty30284.node0");
	    WebElement	 checked=driver.findElement(By.xpath("//*[@id=\"j_idt87:console1\"]/tbody/tr/td[1]/div/div[2]"));
	    checked.click();
	    WebElement unchecked=driver.findElement(By.xpath("//*[@id=\"j_idt87:city2\"]/div/div[1]/div/div[2]"));
	
		boolean status1=checked.isEnabled();
		boolean status2=unchecked.isSelected();
		
		System.out.println(status1);
		System.out.println(status2);

	}

}
