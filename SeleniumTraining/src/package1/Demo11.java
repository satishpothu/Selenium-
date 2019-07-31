package package1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo11 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\Users\\SatishPothu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.navigate().to("http://www.google.com/");
	    driver.findElement(By.linkText("Gmail")).sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
	    
	    /*Actions ac =  new Actions(driver);
	    ac.sendKeys(driver.findElement(By.linkText("Gmail")), Keys.chord(Keys.CONTROL,Keys.TAB)).perform();*/
	    
	    
	    ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
	    
	    System.out.println(tabs.size());
	    
	    driver.switchTo().window(tabs.get(1));
	    System.out.println(driver.getTitle());
	    
	    driver.switchTo().window(tabs.get(0));
	    System.out.println(driver.getTitle());
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    	
	    
	    
	    
	    
	    
	   /* Robot rob = new Robot();
	    rob.keyPress(KeyEvent.VK_CONTROL);
          Thread.sleep(2000);
		  rob.keyPress(KeyEvent.VK_TAB);*/
		   
	    
	    
	    
	}
}