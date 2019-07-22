package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SatishPothu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		
		driver.manage().window().maximize();
		
	    
		
		Actions Mo = new Actions(driver);
		Mo.sendKeys(driver.findElement(By.id("btnLogin")),(Keys.ENTER));
		
		
		
		
		
		
		
	}	
}