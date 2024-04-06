package pageObjects;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class movieTickets 
{
	Exceldata excel=new Exceldata();
	WebDriver driver;
	
   @FindBy(linkText="Movies")
   WebElement movies;
   
   @FindBy(xpath="//div[@class='sc-133848s-2 sc-1y4pbdw-11 bPeUKF']//div[@class='sc-133848s-2 sc-1y4pbdw-12 hkAiCj']")
   List<WebElement> lstLanguage;
   
   public movieTickets(WebDriver driver) 
   {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
   }
   public void clickMovies() throws InterruptedException 
   {
	   movies.click();
	   Thread.sleep(3000);
   }
   
   public void movie_language() throws InterruptedException, IOException

      {

   	   Thread.sleep(5000);

   	   excel.createExcelFile("/ExcelSheet/myExcelSheetLanguage.xlsx");

   	   excel.fillExcelFileLanguage(lstLanguage);


      }
   
}
