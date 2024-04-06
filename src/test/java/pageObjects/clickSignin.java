package pageObjects;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class clickSignin 
{
  WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"super-container\"]/div[2]/div[1]/header/div[1]/div/div/div/div[2]/div[2]/div[1]")
     WebElement signin;
	
	@FindBy(xpath="//*[@id=\"modal-root\"]/div/div/div/div/div[2]/div/div[1]/div/div[1]/div")
	WebElement google;
	
	@FindBy(xpath="//*[@id=\"identifierId\"]")
	WebElement email;
	
	 @FindBy(xpath="//*[@id=\"identifierNext\"]/div/button/span")
	 WebElement next;
	 
	 Set<String> windowIds;
	 ArrayList<String> windowIdsList;
	 
    public clickSignin(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver,this);
    }
    
    public void clickSignIn()
    {
    	signin.click();
    }
    
    public void clickGoogle() throws InterruptedException 
    {
    	Thread.sleep(5000);
    	google.click();
      	Thread.sleep(5000);
    }
    
    public void enterEmail(String emailValue) throws InterruptedException 
    {
    	windowIds=driver.getWindowHandles();
    	windowIdsList=new ArrayList<String>(windowIds);
    	for(String winIds:windowIdsList) {
//    		System.out.println(winIds);
    		String signInTitle=driver.switchTo().window(winIds).getTitle();
    		if(signInTitle.equals("Sign in - Google Accounts")) {
    			Thread.sleep(5000);
    	    	email.sendKeys(emailValue);
    	    	
    		}
    	}
    }
    
    public void clickNext() throws InterruptedException 
    {
    	Thread.sleep(5000);
		next.click();
		Thread.sleep(6000);
	}
    
    public void takeScreenShot() throws IOException {
    	
    	TakesScreenshot ss= (TakesScreenshot)driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File target = new File("screenshotfullscreen.png");
		FileUtils.copyFile(source, target);
   
}
}
