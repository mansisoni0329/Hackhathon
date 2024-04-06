package testCases;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import pageObjects.selectCity;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

@Test
public class Tc1_city 
{
	static WebDriver driver;
	
  public void City_t1() throws InterruptedException
  {
	  selectCity city= new selectCity(driver);
	  city.clickCity();
	  Thread.sleep(3000);
  }
  
  
  @Parameters({"browser"})
  @BeforeTest
  public void beforeSuite( String br) throws InterruptedException
  {
	  
	  if(br.equalsIgnoreCase("chrome")) {
		  driver = new ChromeDriver();
	  }
	  else if(br.equalsIgnoreCase("edge")) {
		  driver=new EdgeDriver();
	  }else {
		  System.out.println("Driver not found");
	  }
	  
	  driver.get("http://bookmyshow.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
  }
 
  @AfterTest
  public void afterSuite() 
  {
	  driver.quit();
  }

}
