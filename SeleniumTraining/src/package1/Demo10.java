package package1;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo10 {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\Users\\SatishPothu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.navigate().to("http://elearning.upskills.in/");
	    WebElement username = driver.findElement(By.xpath("//*[@id='login']"));
	    WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
	  
	    username.sendKeys("admin");
	    password.sendKeys("admin@123");
	    
	    driver.findElement(By.xpath("//*[@name='submitAuth']")).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"tabs-1\"]/div/div[2]/div[2]/ul/li[4]/a")).click();
	    	
	driver.findElement(By.xpath("//*[@id = 'user_import_import_file']")).sendKeys("C:\\Users\\SatishPothu\\Desktop\\sel.csv");
	    
	   
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
		
		
	}

}
