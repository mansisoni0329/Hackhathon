package pageObjects;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selectCity 
{
	WebDriver driver;

	@FindBy(xpath="//*[@id=\"modal-root\"]/div/div/div/div[1]/div/div/input")
	WebElement searchCity;
	
	@FindBy(xpath="//*[@id=\"modal-root\"]/div/div/div/div[1]/div[2]/div/ul/li")
	List<WebElement> drp;

	
	public selectCity(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clickCity() throws InterruptedException 
	{
       searchCity.sendKeys("pune");
       Thread.sleep(5000);
       
       for(int i=0;i<drp.size();i++)
       {
     	  if(drp.get(i).getText().equalsIgnoreCase("pune"))  
     	  {
     		  drp.get(i).click();
     	  }
     		  
       }
       Thread.sleep(7000);
	}
}


  
  
  

