package SCRIPT;

import org.testng.annotations.Test;

import Generic1.Generic_class;
import POM.UserNamePage;

public class Test1 extends Generic_class
 {
     @Test
     public void openAppln()
     {
    	 UserNamePage u1=new UserNamePage(driver);
    	 u1.enterUn();
    	 u1.clicknext();
    	 
     }

}
