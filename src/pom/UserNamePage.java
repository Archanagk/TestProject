package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic1.Base_Page;
import Generic1.Generic_Webele;

public class UserNamePage extends Base_Page
{
  @FindBy(name="identifier")
  private WebElement un;
  @FindBy(xpath="//span[.='Next']")
  private WebElement next;
	public UserNamePage(WebDriver driver) {
		super(driver);
		
	}
	public void enterUn()
	{
	Generic_Webele w1=new Generic_Webele();
	w1.send_Data(un, "archanagk1994@gmail.com");
	}
    public void clicknext()
    {
    	next.click();
    }
}
