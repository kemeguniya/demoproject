package Baselibrary;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import Screenshotutility.Screenshotutility;


public class Baselibrary
{
	public static WebDriver driver;
	
	public void getlaunch (String url)
	{
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
//	@AfterTest
//	public void Teardown()
//	{
//		driver.close();
//		
//	}
	
	@AfterMethod
	public void getresultanalysis(ITestResult result)
	{
		String methodname=result.getMethod().getMethodName();
		if (result.isSuccess()) 
		{
			Screenshotutility.getscreenshot("Passed", methodname);
		}
		else if (result.getStatus()==ITestResult.FAILURE) 
		{
			Screenshotutility.getscreenshot("Failed", methodname);
		}
		else if (result.getStatus()==ITestResult.SKIP) 
		{
			Screenshotutility.getscreenshot("Skip", methodname);
		}
	}
	
	public static String getdateTime() 
	{
		String datetime=null;
		try 
		{
			DateFormat df=new SimpleDateFormat("dd-MM-yyyy:HH-mm-ss");
			Date dateobj=new Date();
			df.format(dateobj);
			datetime =df.format(dateobj);
			return datetime;
		} 
		catch (Exception e) 
		{
			System.out.println("issue in getdatetime" +e);
		}
		return datetime;
	}
	

	
}
