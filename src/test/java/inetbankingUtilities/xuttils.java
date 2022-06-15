package inetbankingUtilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xuttils {
	public static FileInputStream file;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static int getRowCount(String xlfile,String xlsheet) throws IOException
	{
		file=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(file);
		ws=wb.getSheet(xlsheet);
		int rowcount=ws.getLastRowNum();
		wb.close();
		file.close(); 
		return rowcount;
		
	}
	public static int getcellCount(String xlfile,String xlsheet,int rownum) throws IOException
	{
		file=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(file);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rownum);
		int cellcount=row.getLastCellNum();
		wb.close();
		file.close(); 
		return cellcount;
		
	}
	public static String getcelldataCount(String xlfile,String xlsheet,int rownum,int colnum) throws IOException
	{
		file=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(file);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rownum);
		cell=row.getCell(colnum);
		String data;
		try
		{
			DataFormatter formatter= new DataFormatter();
			String celldata= formatter.formatCellValue(cell);
			return celldata;
		}
		catch(Exception e)
		{
			data="";
		}
		wb.close();
		file.close();
		return data;
	}
	public static void setcelldata(String xlfile,String xlsheet,int rownum,int colnum,String data) throws IOException
	{
		file=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(file);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rownum);
		cell=row.getCell(colnum);
		cell.setCellValue(data);
		file=new FileInputStream(xlfile);
		wb.write(fo);
		file.close();
		fo.close();
	}

}
