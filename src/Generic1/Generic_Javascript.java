package Generic1;

import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Generic_Javascript implements All_Constant
 {
	public void javaScript(WebElement ele,WebDriver driver)
	{
		Point loc = ele.getLocation();
	  int x = loc.getX();
	   int y = loc.getY();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	public static void ScreenShot(WebDriver driver,String tcname) throws IOException
	{
		String photos=Photos_path;
		Date d=new Date();
		String d1=d.toString();
		String date=d1.replaceAll(":","-");
		TakesScreenshot ts=(TakesScreenshot) driver;
	    java.io.File src = ts.getScreenshotAs(OutputType.FILE);
	    java.io.File dst = new java.io.File(photos+date+tcname+".jpeg");
	    FileUtils.copyFile(src,dst);
	}
	

}
