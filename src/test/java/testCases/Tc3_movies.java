package testCases;
import java.io.IOException;

import org.testng.annotations.Test;
import pageObjects.movieTickets;

public class Tc3_movies 
{
	movieTickets mt;
	
  @Test(priority=1)
  public void Movies_t1() throws InterruptedException 
  {

	  new Tc1_city();
	  mt=new movieTickets(Tc1_city.driver);
	  Thread.sleep(5000);
	  mt.clickMovies();
  }
  
  @Test(priority=2)
  public void Movies_t2() throws InterruptedException, IOException
  {
	  mt.movie_language();
  }
}
