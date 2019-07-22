package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo7{

public static void main(String[] args) {
	// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\Users\\SatishPothu\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
    driver.navigate().to("http://retail.upskills.in/admin/");
    WebElement username = driver.findElement(By.xpath("//*[@name = 'username' and @id = 'input-username']"));
    WebElement password = driver.findElement(By.xpath("//*[@name = 'password' and @id = 'input-password']"));

    username.sendKeys("admin");
    password.sendKeys("adminuser@12345");
    
    Actions ac =  new Actions(driver);
    ac.sendKeys(Keys.ENTER).perform();
    
   

    
    
    
    
    
    
    
    
    
    
    
    
    	

}



}