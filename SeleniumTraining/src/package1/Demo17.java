package package1;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Demo17 {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException, BiffException {
		// TODO Auto-generated method stub
     File fexcel = new File("C:\\javaprograms\\Test1.xls");
     //Create a workbook in the excel file
     WritableWorkbook writebook =  Workbook.createWorkbook(fexcel);
     writebook.createSheet("satish",0);
     //I have to pass the data to my sheet which is named as sunil
     WritableSheet writesheet = writebook.getSheet(0);
     Label testdata =  new Label(0,0,"IBM");
     writesheet.addCell(testdata);
     //add one more data
     Label testdata2 = new Label(0,1,"Manipal");
     writesheet.addCell(testdata2);
     writebook.write();
     writebook.close();
     
   //Read  from the excel sheet the data what i have added
     
     Workbook workbook =  Workbook.getWorkbook(new File("C:\\javaprograms\\Test1.xls"));
     Sheet sheet =  null;
     int noofsheets = workbook.getNumberOfSheets();
     Cell cell = null;
     //iterate the  sheets present in the excel
     for(int p=0;p<noofsheets;p++)
     {
    	 
    	 sheet = workbook.getSheet(p);
    	 //fetch the data of rows and column
    	 int noofrows = sheet.getRows();
    	 int noofcolumns =  sheet.getColumns();
    	 //Print the data
    	 System.out.println(sheet.getRows() +"\t" + sheet.getColumns());
    	 System.out.println("data from sheet" +p);
    	 for(int i =0;i<noofrows;i++)
    		 for(int j =0;j<noofcolumns;j++)
    		 {
    			 cell = sheet.getCell(j,i);
    			 //condition to check data is present
    			 
    			 if(cell.getContents().length()>0)
    			 {
    				System.out.println(cell.getContents()); 
    				 
    				 
    			 }
    		 }
    		
    			 
     }
     
     
     
     
     
     
     
     
     
		
		
		
	}

}
