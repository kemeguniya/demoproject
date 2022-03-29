package Waitutility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Baselibrary.Baselibrary;

public class Waitutility extends Baselibrary
{
	static WebDriverWait wait=null;
	public static void alertpresent(int time) 
	{
		wait = new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public static void visibilityofelements(int time, WebElement ele) 
	{
		wait = new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	
}
