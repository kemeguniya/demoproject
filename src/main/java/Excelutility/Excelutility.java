package Excelutility;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutility 
{
	public static String getdata(String path, int row, int coulum) 
	{
		String data="";
		try {
			FileInputStream fis=new FileInputStream(path);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet=wb.getSheetAt(0);
			data=sheet.getRow(row).getCell(coulum).getStringCellValue();
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		return data;
	}
	
	public static void main(String[] args) {
		String path="C:\\Users\\Admin\\eclipse-workspace\\project1\\Data\\Book 3.xlsx";
		for(int i=1; i<=7;i++)
		{
			String out1 = getdata(path, i, 0);
			String out2 = getdata(path, i, 1);
			System.out.println(out1+"\n"+out2);
		}
	}
	
}
