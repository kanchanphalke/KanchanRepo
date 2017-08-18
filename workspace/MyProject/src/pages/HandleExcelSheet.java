package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;

public class HandleExcelSheet {
	
	
	static String user;static String pwd;
	static String filePath = "F:\\Auto\\TestData\\Testsheet1.xls";

	
	static LinkedHashMap m = new LinkedHashMap();
	
	public static LinkedHashMap takeData() throws IOException
	{
		FileInputStream fis = new FileInputStream(filePath);
		Workbook w = new HSSFWorkbook(fis);
		HSSFSheet s = (HSSFSheet) w.getSheetAt(0);
		
		int totalRow = s.getLastRowNum();
		System.out.println("totalRow: "+totalRow);
		
		for(int i=1; i<=totalRow; i++) 
		{
			
			Row r = s.getRow(i);
			
			int totalColumn = r.getLastCellNum();
			
				for(int j=0; j<totalColumn-1; j++)
				{
					
					user = r.getCell(0).getStringCellValue();
										
					m.put("username"+i , user);
					
				}
				
				for(int k=1; k<=totalColumn-1; k++)
				{
					
					pwd = r.getCell(k).getStringCellValue();

					m.put("password"+i , pwd);
				
				}
		
		}	
		
		System.out.println("m : "+m);
		return m;

	}


}