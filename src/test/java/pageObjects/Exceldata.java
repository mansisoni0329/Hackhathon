package pageObjects;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
 
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
 
public class Exceldata {
	FileOutputStream file ;
	 XSSFWorkbook workbook ;
	public void createExcelFile(String path) throws FileNotFoundException {
		file = new FileOutputStream(System.getProperty("user.dir")+path);
		workbook = new XSSFWorkbook();
	}

	public void fillExcelFileSports(List<WebElement> data) throws IOException {
		   XSSFSheet sheet = workbook.createSheet();
		   for(int i=0;i<data.size();i++) {
			   XSSFRow row1 = sheet.createRow(i);
			   row1.createCell(0).setCellValue(data.get(i).getText());
		   }
		   workbook.write(file);
		   workbook.close();
		   file.close();
	}
	public void fillExcelFileLanguage(List<WebElement> data) throws IOException {
		   XSSFSheet sheet = workbook.createSheet();
		   for(int i=0;i<data.size();i++) {
			   XSSFRow row1 = sheet.createRow(i);
			   row1.createCell(0).setCellValue(data.get(i).getText());
		   }
		   workbook.write(file);
		   workbook.close();
		   file.close();
	}
 
}