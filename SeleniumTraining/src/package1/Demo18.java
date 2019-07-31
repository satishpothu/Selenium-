package package1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo18 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SatishPothu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		File Fexcel =  new File("C:\\javaprograms\\Test1.xlsx");
		FileInputStream fis = new FileInputStream(Fexcel);
		XSSFWorkbook wb =  new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("sheet1");
	    String	Data1	 = sheet.getRow(0).getCell(0).getStringCellValue();
	    System.out.println(Data1);
	    String Data2 = sheet.getRow(0).getCell(1).getStringCellValue();
	    System.out.println(Data2);
	    driver.findElement(By.id("txtUsername")).sendKeys(Data1);
	    driver.findElement(By.id("txtPassword")).sendKeys(Data2);
	    driver.findElement(By.id("btnLogin")).click();
	    
	    
	    
		
		
				
	    
	}
}

	    
	    
	    