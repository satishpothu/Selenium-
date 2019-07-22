package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\SatishPothu\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SatishPothu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		//driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.navigate().refresh();
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		String Expectedtitle = "OrangeHRM";
		if(Expectedtitle.contains(actualtitle))
		{
			
			System.out.println("Title matches");
			driver.findElement(By.id("welcome")).click();
		    Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
			driver.close();
		}
		
		else 
		{
			
		System.out.println("Title is not correct.");
		
		driver.close();
			
		}
			
			
		
		
		
		
	}

}
