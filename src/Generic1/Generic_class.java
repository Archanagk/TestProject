package Generic1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Generic_class implements All_Constant {
	public WebDriver driver;
	static {
		System.setProperty(Gecko_key, Gecko_value);
		//System.setProperty(Chrome_key, Chrome_value);
	}
   @BeforeMethod()
   public void openApp() throws FileNotFoundException, IOException
   {
	   driver=new FirefoxDriver();
	   Generic_Webele w1=new Generic_Webele();
	      String url = w1.property12("./pro.properties", "url");
	   driver.get(url);
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
   }
//	@AfterMethod()
//	public void closeAppln()
//	{
//		driver.quit();
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//@Parameters({ "browser" })
	//@BeforeMethod
	//public void OpenAppln(String browser) {
		//if (browser.equals("chrome")) {
			//driver = new ChromeDriver();
		
			//driver.get("https://www.luxire.com");
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//}
//		} else {
//			driver = new FirefoxDriver();
//			driver.get("https://www.amazon.com");
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		}

	

	@AfterMethod
	public void closeAppln(ITestResult res) throws IOException {
		int status = res.getStatus();
		String tcname = res.getName();
		if (status == 2) {
			Generic_Javascript.ScreenShot(driver, tcname);
			Reporter.log(tcname, true);
		}
		driver.close();

	}

}
