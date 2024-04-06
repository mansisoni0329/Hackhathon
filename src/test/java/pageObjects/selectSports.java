package pageObjects;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selectSports 
{
	Exceldata excel=new Exceldata();
     WebDriver driver;
     
    @FindBy(xpath="//*[@id=\"super-container\"]/div[2]/div[1]/header/div[2]/div/div/div/div[1]/div/a[5]")
    WebElement sports;
     
    @FindBy(xpath="//div[@class=\"sc-7o7nez-0 hGuczM\"]")
    List<WebElement> sportsName;
    
    
     public selectSports( WebDriver driver) 
     {
    	 this.driver=driver;
    	PageFactory.initElements(driver, this);

     }
    
    public void clickSports() throws InterruptedException  
    {
    	Thread.sleep(5000);
    	sports.click();
    	//Thread.sleep(6000);
    }
    
    public void sportsName() throws IOException, InterruptedException {
		Thread.sleep(5000);
		excel.createExcelFile("/ExcelSheet/myExcelSheetSports.xlsx");
		excel.fillExcelFileSports(sportsName);
	}
    

    
}
