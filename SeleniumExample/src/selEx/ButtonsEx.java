package selEx;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.Location XY
		System.setProperty("webdriver.chrome.driver", 
				"/home/mac/ADS/Chromedriver/107/chromedriver_linux64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		WebElement getPositon= driver.findElement(By.name("j_idt88:j_idt90"));
		Point xypoit=getPositon.getLocation();
		int xvalue=xypoit.getX();
		int yvalue=xypoit.getY();
		
		System.out.println("X value is :"+xvalue+"Y value is : "+yvalue);
		
		//2.Find color
		
		WebElement findColor=driver.findElement(By.id("j_idt88:j_idt96"));
	    String color=	findColor.getCssValue("color");
	    System.out.println(color);
	    
	    //3.Height and width
	   WebElement findHeight= driver.findElement(By.id("j_idt88:j_idt98"));
	  int height= findHeight.getSize().getHeight();
	  int width=findHeight.getSize().getWidth();
	  
	  
	  System.out.println("Heiht is : "+height+"Width is : "+width);
	  
	  //
	

	}

}
