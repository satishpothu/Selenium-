package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\Users\\SatishPothu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.navigate().to("http://newtours.demoaut.com/");
	    WebElement username = driver.findElement(By.xpath("//*[@name='userName']"));
	    WebElement password = driver.findElement(By.xpath("//*[@name='password']"));
	  
	    username.sendKeys("sunil");
	    password.sendKeys("sunil");
	    
	    Actions Mo = new Actions(driver);
	    //Mo.sendKeys(Keys.ENTER).perform();
	    
	   //Action Mouseover = Mo.moveToElement(driver.findElement(By.linkText("Cruises"))).build();
	   
	   //Mouseover.perform();
	    
	    Mo.moveToElement(username).sendKeys(Keys.CLEAR).perform();
	    
	    
	   
	   
	   
	   
	   
	  
	 
	  
	   
	   
	   
	   
	   
	   
	    
	    
	    	
		
		
		
		
		
	}

	private static void Actions(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

}
