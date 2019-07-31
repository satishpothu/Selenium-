package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SatishPothu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.navigate().to("https://www.toolsqa.com/iframe-practice-page/");
	        List<WebElement> Frames = driver.findElements(By.xpath("//iframe"));
	        System.out.println("Total frames present in the page is "    +Frames.size());
	       
	        
	        int i;
	        for(i = 0 ; i<Frames.size();i++)
	        
	        {
	        	
	        	
	        System.out.println(Frames.get(i).getAttribute("name"));
	        	
	        	
	        }
	        
	       driver.switchTo().frame("iframe1");
	      String text =  driver.findElement(By.xpath("//*[@class = 'wpb_wrapper']//child::h2/span")).getText();
	      System.out.println(text);
	      driver.switchTo().defaultContent();
	      //driver.switchTo().frame("iframe2");
	      //driver.findElement(By.linkText("Sortable")).click();
	      
	      
	       
	       	
	        
	        
	        
	        
		

		
	}

}
