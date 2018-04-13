package demo.mtp.Utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {
	
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	private static XSSFRow Row;
	
	public static void setExcelFile() throws Exception {
		 
		try {

			
     	String Path= "C:\\Santander\\Datos.xlsx";
		String SheetName="General";

		FileInputStream ExcelFile = new FileInputStream(Path);

		ExcelWBook = new XSSFWorkbook(ExcelFile);

		ExcelWSheet = ExcelWBook.getSheet(SheetName);

		} catch (Exception e){

			throw (e);

		}

    }


       public static String getCellData(int RowNum, int ColNum) throws Exception{

		try{

			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

			String CellData = Cell.getStringCellValue();

			return CellData;

			}catch (Exception e){

			return"";

			}

}


     public void setCellData(String Result,  int RowNum, int ColNum) throws Exception	{

	try{
			
 		Row  = ExcelWSheet.getRow(RowNum);

		Cell = Row.getCell(ColNum);

		if (Cell == null) {

			Cell = Row.createCell(ColNum);

			Cell.setCellValue(Result);

			} else {

				Cell.setCellValue(Result);

			}

				FileOutputStream fileOut = new FileOutputStream("C:\\Santander\\Datos.xlsx");

				ExcelWBook.write(fileOut);

				fileOut.flush();

				fileOut.close();

			}catch(Exception e){

				throw (e);

		}

	}
     
     public boolean elementoPresente(WebElement elementName, int timeout, WebDriver driver){
         try{
             WebDriverWait wait = new WebDriverWait(driver, timeout);
             wait.until(ExpectedConditions.visibilityOf(elementName));
             return true;
         }catch(Exception e){
             return false;
         }
     }
	
}
