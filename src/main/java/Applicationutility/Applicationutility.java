package Applicationutility;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import Baselibrary.Baselibrary;


public class Applicationutility extends Baselibrary
{
	public static void doubleclik(WebElement ele)
	{
		Actions act=new Actions(driver);
		act.doubleClick(ele).perform();
	}
	
	public static void rightclick(WebElement ele)
	{
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
	}
	
	public static void changewindow(int tabno)
	{
		Set<String> set =driver.getWindowHandles();
		ArrayList<String> tabs=new ArrayList<String>(set);
		driver.switchTo().window(tabs.get(tabno));
	}
	
	public static void clickme(WebElement ele) 
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.click();
	}
	
	public static void mouseover(WebElement ele)
	{
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		ele.click();
	}
	
	public static void getscroll(WebElement ele) 
	{
		try {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scroLLIntoView(True)", ele);
		} catch (Exception e) 
		{
			System.out.println("issue in Getscroll"+e);
		}
	}
	
	
	public static void drpableimg(WebElement ele)
	{
		
	
	}
	
}
