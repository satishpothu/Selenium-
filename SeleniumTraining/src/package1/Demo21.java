package package1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SatishPothu\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("file:///C:/Users/SatishPothu/Desktop/selenium.html");
		String d = 	driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]")).getText();
		String d1 = driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]//preceding-sibling::td[1]")).getText();
		String d2 = driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]//following-sibling::td")).getText();
		
				
		System.out.println(d);
		System.out.println(d1);
		System.out.println(d2);
		
		
			
			
			

	}

}
