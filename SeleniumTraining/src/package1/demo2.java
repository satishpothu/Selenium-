package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SatishPothu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.navigate().to("http://newtours.demoaut.com/");
	    WebElement username = driver.findElement(By.xpath("//*[@name='userName']"));
	    WebElement password = driver.findElement(By.xpath("//*[@name='password']"));
	  
	    username.sendKeys("sunil");
	    password.sendKeys("sunil");
	    
	 
	  
	  if(driver.findElement(By.xpath("//*[@name = 'tripType' and @value= 'oneway']")).isSelected());
			  {
		  
		  
			    driver.findElement(By.xpath("//*[@name = 'tripType' and @value= 'oneway']")).click();;
				  
			  }	 
			  
		 WebElement DD = driver.findElement(By.name("passCount"));
		 Select sel = new Select(DD);
		 List<WebElement> options = sel.getOptions();
		 System.out.println(options.size());
		 for(int i= 0;i<options.size();i++)
		    {
			 System.out.println(options.get(i).getText());
			 
		     }
		 
		 //sel.selectByValue("2");
		 //Thread.sleep(3000);
		 sel.selectByVisibleText("2");
		 
		 WebElement first = sel.getFirstSelectedOption();
		 System.out.println(first);
		 
		 //Thread.sleep(3000);
		 //sel.selectByIndex(3);
		 
		 driver.findElement(By.xpath("//*[@name = 'servClass' and @value= 'Business']")).click();;
		  
		 driver.findElement(By.xpath("//*[@name = 'findFlights']")).click();
		 
		 driver.findElement(By.name("reserveFlights")).click();
		 
		
		 
		 
		 
		 
	WebElement FirstName = 	driver.findElement(By.xpath("//*[@name='passFirst0']")); 
	
	 FirstName.sendKeys("Satish");
	
	 WebElement LastName = 	driver.findElement(By.xpath("//*[@name='passLast0']")); 
		 
	LastName.sendKeys("Kumar");
	
	 WebElement D = driver.findElement(By.name("pass.0.meal."));
	 Select sele = new Select(D);
	 
	 
	 Thread.sleep(200);
	
	 List<WebElement> Mealoptions = sele.getOptions();
	 sele.selectByIndex(1);
	 
	 
	 WebElement cardnumber = 	driver.findElement(By.name("creditnumber")); 
	 cardnumber.sendKeys("123456789");
	 
	 Thread.sleep(300);
	 
	 List<WebElement>checkbox = driver.findElements(By.xpath("//*[@name ='ticketLess']"));
	
	 for(int i= 0;i<checkbox.size();i++)
	    {
		 
		 checkbox.get(1).click();
		 
	     }
	 
		 
		 
	 
	 

	 
	 
	 
	 
	
	
		 
		  
		 
		 
		 
		 
		 
		 
		 
		 
				 
		
		 
		
			  
	 
	  
	  
	    
	}
	
}
	    
