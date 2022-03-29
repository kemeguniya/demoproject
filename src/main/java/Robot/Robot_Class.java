package Robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import Baselibrary.Baselibrary;

public class Robot_Class extends Baselibrary
{
	public static void setClipboardData( String string) throws AWTException, InterruptedException 
	{
		Robot robot = new Robot();
		StringSelection sl=new StringSelection(string);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sl, null);
		
        robot.keyPress(KeyEvent.VK_CONTROL);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_V);
        Thread.sleep(2000);
        robot.keyRelease(KeyEvent.VK_V);
        Thread.sleep(2000);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
	}
	
//	public static void uploadFile(String fileLocation) {
//        try
//    	{
//        	
//        	Robot robot = new Robot();
//        	
//        	setClipboardData(fileLocation);
//        	
//            robot.keyPress(KeyEvent.VK_CONTROL);
//            Thread.sleep(3000);
//            robot.keyPress(KeyEvent.VK_V);
//            Thread.sleep(2000);
//            robot.keyRelease(KeyEvent.VK_V);
//            Thread.sleep(2000);
//            robot.keyRelease(KeyEvent.VK_CONTROL);
//            Thread.sleep(2000);
//            robot.keyPress(KeyEvent.VK_ENTER);
//            Thread.sleep(2000);
//            robot.keyRelease(KeyEvent.VK_ENTER);
//            Thread.sleep(2000);
//    	} 
//        catch (Exception e)
//        {
//        
//        }
//    }
	
	
}
