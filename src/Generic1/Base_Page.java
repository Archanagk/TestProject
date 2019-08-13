package Generic1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Base_Page  
 {
	public  WebDriver driver;
	public Base_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
    public void verifyTitle(String title)
    {
    	WebDriverWait wb=new WebDriverWait(driver,10);
    	try{
    		wb.until(ExpectedConditions.titleContains(title));
    	  Reporter.log("title is matching",true);
       }
    	catch(Exception e)
    	{
    		Reporter.log("title is not matching",true);
    		Assert.fail();
    	}
  }
    public void verifyElement(WebElement element)
    {
    	WebDriverWait wb=new WebDriverWait(driver,10);
    	try{
    		wb.until(ExpectedConditions.visibilityOf(element));
    	  Reporter.log("element is present",true);
       }
    	catch(Exception e)
    	{
    		Reporter.log("element is not present",true);
    		Assert.fail();
    	}
  
    }
 }