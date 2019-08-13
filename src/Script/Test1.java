package Script;

import org.testng.annotations.Test;

import pom.UserNamePage;
import Generic1.Generic_class;

public class Test1 extends Generic_class
 {
     @Test
     public void openAppln()
     {
    	 UserNamePage u1=new UserNamePage(driver);
    	 u1.enterUn();
    	 u1.clicknext();
      System.out.println("hii");
      
    	 
     }

}
