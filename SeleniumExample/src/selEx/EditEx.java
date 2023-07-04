package selEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"/home/mac/ADS/Chromedriver/107/chromedriver_linux64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		WebElement typeName= driver.findElement(By.id("j_idt88:name"));
		typeName.sendKeys("Dinesh Kumar VS");
		
		driver.findElement(By.id("j_idt88:j_idt91")).clear();
		WebElement send=driver.findElement(By.id("j_idt88:j_idt91"));
		send.sendKeys("dinesh");
		
		WebElement append=driver.findElement(By.id("j_idt88:j_idt91"));
	    String text =	append.getAttribute("value");
	    System.out.println(text);
	    
	    WebElement disabled=driver.findElement(By.xpath("//*[@id=\"j_idt88\"]/div[3]/div"));
	   boolean enabled= disabled.isEnabled();
	    System.out.println(enabled);
		

	}

}
