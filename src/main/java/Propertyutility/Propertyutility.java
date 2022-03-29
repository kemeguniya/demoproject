package Propertyutility;


import java.io.FileInputStream;
import java.util.Properties;

import Baselibrary.Baselibrary;

public class Propertyutility extends Baselibrary
{
	static String path = "C:\\Users\\Admin\\eclipse-workspace\\demoproject\\Data\\Config.properties"; 
	
	public static String getdataproperty (String key) 
	{
		String value =" ";
		try 
		{
			FileInputStream fis = new FileInputStream(path);
			Properties prop = new Properties();
			prop.load(fis);
			value=prop.getProperty(key);
		} 
		catch (Exception e) 
		{
			System.out.println("Issue in Getproperty" +e);		
		}	
		return value;
	}
	
	
}
