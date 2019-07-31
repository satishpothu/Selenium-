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

public class Demo19 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SatishPothu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		File Fexcel =  new File("C:\\javaprograms\\Test1.xlsx");
		FileInputStream fis = new FileInputStream(Fexcel);
		XSSFWorkbook wb =  new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		int	rowcount =  sheet.getLastRowNum();
		System.out.println(rowcount);
		for(int i=0;i<=rowcount;i++)
		{
			int columncount =  sheet.getRow(i).getLastCellNum();
			System.out.println(columncount);
			for(int j =0;j<columncount;j++)
			{
				
				System.out.println("value of" +i + "row" +j +"column" + sheet.getRow(i).getCell(j));
			}
		}
		
		wb.close();
		
		
		
		
		
		
		
	}
}