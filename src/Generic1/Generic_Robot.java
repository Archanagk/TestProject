package Generic1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Generic_Robot 
 {
	Robot r;
	
	public Generic_Robot() throws AWTException
	{
		 r=new Robot();
		
	}
	public void robotEnter()
	{
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public void robotCancel()
	{
		r.keyPress(KeyEvent.VK_CANCEL);
		r.keyRelease(KeyEvent.VK_CANCEL);
	}
	public void robotAccept()
	{
		r.keyPress(KeyEvent.VK_ACCEPT);
		r.keyRelease(KeyEvent.VK_ACCEPT);
	}
	public void robotAlt()
	{
		r.keyPress(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_ALT);
	}
	public void robotSkey()
	{
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_S);
	}
	public void robotDelete()
	{
		r.keyPress(KeyEvent.VK_DELETE);
		r.keyRelease(KeyEvent.VK_DELETE);
	}
	public void robotDown()
	{
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	public void robotnew_Tab()
	{
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
	}
	
	
	
 }
