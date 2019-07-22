package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class demo4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SatishPothu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("Cruises")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
	    Thread.sleep(3000);
	    driver.navigate().refresh();
	    driver.close();
	    WebElement Link = driver.findElement(By.linkText("Cruise"));
	    
	    Actions Mh =  new Actions(driver);
	    Action mouseover= Mh.moveToElement(Link).build();
	    mouseover.perform();
	    
	    
	    
	    
	    
	    		
	    
	    
		
		
		
		
		
		
		
		
		
		
		
	}

	
}
