package Generic1;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Genericmethod_Select 
 {
	Select s;
	public Genericmethod_Select(WebElement ele)
	{
		s=new Select(ele);
		
	}
	public void selectIndex(int i)
	{
	
		s.selectByIndex(i);
	}
	public void selectVisible(String txt)
	{
	
		s.selectByVisibleText(txt);
	}
	public void selectValue(String value)
	{
	
		s.selectByValue(value);
	}
	public void deselectAl()
	{
		
		s.deselectAll();
	}
	public void deselectIndex(int i)
	{

		s.deselectByIndex(i);
	}
	public void deselectIndex(String value)
	{
		
		s.deselectByValue(value);
	}
	public void isMultiple1()
	{
		boolean b = s.isMultiple();
		System.out.println(b);
	}
	public List<WebElement> options()
	{
       
		List<WebElement> option = s.getOptions();
	    return option;
		
	  
	}
	public void firstSelected()
	{
		
		WebElement option = s.getFirstSelectedOption();
		System.out.println(option);
	}
	public void allSelected()
	{

		s.getAllSelectedOptions();
	}

}
