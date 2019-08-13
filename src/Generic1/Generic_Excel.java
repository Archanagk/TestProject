package Generic1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class Generic_Excel implements All_Constant
 {
	public static String getCellValue(String sheet,int row,int cell)
	{
		String v= "";
		try
		{
			FileInputStream f1=new FileInputStream(Excel_path);
			Workbook wb = WorkbookFactory.create(f1);
			Cell c = wb.getSheet(sheet).getRow(row).getCell(cell);
			v=c.toString();
		}
		catch(Exception e)
		{
			Reporter.log("path is invalid",true);
		}
		return v;
		
	}
	public static void writevalue(String sheet,int row,int cell,String value)
	{
		String v= "";
		try
		{
			FileInputStream f1=new FileInputStream(Excel_path);
			Workbook wb = WorkbookFactory.create(f1);
			Cell c = wb.getSheet(sheet).createRow(row).createCell(cell);
			c.setCellValue(value);
			FileOutputStream fos=new FileOutputStream(Excel_path);
			wb.write(fos);
		}
		catch(Exception e)
		{
			Reporter.log("path is invalid",true);
		}
		
		
	}
}
