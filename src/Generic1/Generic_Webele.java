package Generic1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.AttributedCharacterIterator.Attribute;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class Generic_Webele 
 {

	public String text(WebElement ele)
	{
		String txt = ele.getText();
		
		return txt;
	}
	public String tagname(WebElement ele)
	{
		String name = ele.getTagName();
		return name;
	}
	public String attribute(WebElement ele,String value)
	{
		String att = ele.getAttribute(value);
		return att;
	}
	public Point location(WebElement ele)
	{
		Point loc = ele.getLocation();
		return loc;
	}
	
	
	public void writeData(String file,String Sheet,int count,int value,List<WebElement> ele) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		 FileInputStream fis=new FileInputStream(file);
         Workbook wb = WorkbookFactory.create(fis);
         Sheet sh = wb.getSheet(Sheet);
         LinkedList l1=new LinkedList();
         for(int i=0;i<count;i++)
         {
        	 Row r = sh.createRow(i);
          Cell c = r.createCell(value);
          c.setCellValue(ele.get(i).getText());
     	    l1.add(ele.get(i).getText());
     	    
        }
          
         
         FileOutputStream fos=new FileOutputStream(file);
         wb.write(fos);
	}
	
	public void send_Data(WebElement ele,String data)
	{
		ele.sendKeys(data);
	}
	public String property12(String path,String url) throws FileNotFoundException, IOException
	{
		Properties p1=new Properties();
		p1.load(new FileInputStream(path));
		return p1.getProperty(url);
			
		}
	
	}
	
	
		
	
   





