package Generic1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Genericmethod_Actions 
 {
    Actions act;
    public Genericmethod_Actions(WebDriver driver)
    {
    	 act=new Actions(driver); 
    	
    }
	public void moveto(WebDriver driver,WebElement ele)
	{
		
		act.moveToElement(ele).perform();
	}
	public void doubleclk(WebElement ele,WebDriver driver)
	{
		
		act.doubleClick(ele).perform();
	}
	public void dragdrop(WebElement source ,WebElement target ,WebDriver driver)
	{
		
		act.dragAndDrop(source, target).perform();
	}
	public void contextclk(WebDriver driver,WebElement ele)
	{
		
		act.contextClick(ele).perform();
	}

}
