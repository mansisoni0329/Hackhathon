package testCases;
import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.clickSignin;

public class Tc4_clickSignin {
	  clickSignin s;
	  
	  @Test(priority=1)
	  public void Signin_t1() throws InterruptedException 
	  {
		  new Tc1_city();
		  s=new clickSignin(Tc1_city.driver);
		  s.clickSignIn();
	  }
	  
	  @Test(priority=2)
	  public void Signin_t2() throws InterruptedException 
	  {
		  s.clickGoogle();
	  }
	  
	  @Test(priority=3,dataProvider="dp")
	  public void Signin_t3(String emailVal) throws InterruptedException 
	  {
		  Thread.sleep(5000);
		  s.enterEmail(emailVal);
	  }
	  
	  @Test(priority=4)
	  public void Signin_t4() throws InterruptedException 
	  {
		  Thread.sleep(5000);
		  s.clickNext();
		  
	  }

	  
	  @Test(priority=5)
	  public void Signin_t5() throws IOException 
	  {
		  s.takeScreenShot();	  
	  }
	  @DataProvider
	  public Object[] dp()
	  {
		    return new Object[][]
		    {
		    new Object[] { "abc@.com" }
            };
      }
  }

