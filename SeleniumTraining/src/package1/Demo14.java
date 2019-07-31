package package1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo14 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SatishPothu\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   // System.setProperty("webdriver.firefox.driver,"webdriver.chrome.driv)
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        JavascriptExecutor js = 	(JavascriptExecutor)driver;
        js.executeScript("alert('welcome to training')");
        Thread.sleep(2000);
        Alert alert = 	driver.switchTo().alert();
        alert.accept();
       // driver.switchTo().alert().accept();
        js.executeScript("confirm('Enter the credentials')");
        //String text =  alert.getText();
        String text  = driver.switchTo().alert().getText();
        System.out.println(text);
        driver.switchTo().alert().dismiss();
        //alert.dismiss();
        js.executeScript("prompt('Enter the details','Enter Yes/No')");
        Thread.sleep(3000);
        driver.switchTo().alert().sendKeys("Yes");
        driver.switchTo().alert().accept();
        
    
        
        
        
        
        
        
	
		
		
	}

}
