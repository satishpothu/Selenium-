package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo13 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\SatishPothu\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        JavascriptExecutor js  = (JavascriptExecutor)driver;
        String title = js.executeScript("return document.title").toString();
        System.out.println(title);
        String url = js.executeScript("return document.URL").toString()  ;
        String domain = js.executeScript("return document.domain").toString();
        System.out.println(url);
        System.out.println(domain);
        Thread.sleep(2000);
        js.executeScript("document.getElementById('txtUsername').value = 'Admin'");
        js.executeScript("history.go(0)");	
        js.executeScript("document.getElementById('txtUsername').value = 'Admin'");
        
      //WebElement element = 	(WebElement)js.executeScript("return document.getElementById('txtUsername')");
      //String val = element.getAttribute("value");
      //System.out.println(val);
      js.executeScript("document.getElementById('txtPassword').value = 'admin123'");
      js.executeScript("document.getElementById('btnLogin').click()");
      Thread.sleep(200);
      js.executeScript("document.getElementById('menu_pim_viewPimModule').click()");
      Thread.sleep(3000);
      js.executeScript("document.getElementById('menu_pim_viewEmployeeList').click()");
      //js.executeScript("window.scrollBy(0,400)");
      js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
      Thread.sleep(3000);
      //js.executeScript("window.screenTop");
      //js.executeScript("window.scrollTo(0,0)");
      js.executeScript("window.scrollTo(0,-600)");
      //js.executeScript("window.scrollBy(0,-document.body.scrollHeight)\"");
      //js.executeScript("document.getElementById('ohrmList_chkSelectRecord_6').scrollIntoView()");
      
      //System.out.println(driver.findElement(By.id("resultTable")).getText());
      
     String table =  js.executeScript("return document.getElementById('resultTable').innerHTML").toString();
     System.out.println(table);
     js.executeScript("window.history.back()");
     Thread.sleep(2000);
     js.executeScript("window.history.forward()");
     Thread.sleep(3000);
 
     js.executeScript("alert('Welcome to Selenium Training')");
     Thread.sleep(3000);
     // Alert - confirm
     js.executeScript("confirm('Enter the Credentails')");
     Thread.sleep(3000);
     //Alert-promt
     js.executeScript("prompt('Enter the credentials','Enter Yes/NO')");
     
     
     
     
     
     
      
     
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
        
        
        
        
        
	}

}
