package testCases;
import java.io.IOException;

import org.testng.annotations.Test;
import pageObjects.selectSports;

public class Tc2_clicksports{
	selectSports hm;
	
	
  @Test(priority=1)
  public void Sports_t1() throws InterruptedException 
  {
	new Tc1_city();
	hm=new selectSports(Tc1_city.driver);
	Thread.sleep(3000);
	hm.clickSports();
	Thread.sleep(5000);
	  

  }
  @Test(priority=2)
  public void sports_t2() throws IOException, InterruptedException {
	  hm.sportsName();
  }
}
  
