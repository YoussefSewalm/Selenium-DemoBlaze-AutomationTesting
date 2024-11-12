package org.sample.TestingDemoBlaze;

import java.io.File;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;


public class ReadDataFromExcel {


	public String[][] ReadPlaceOrderInfo() throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException
	{
		File file_1=new File("C:\\Users\\giga\\Desktop\\DemoBlaze.xlsx");
		XSSFWorkbook Workbook_1=new XSSFWorkbook(file_1);
		XSSFSheet PlaceOrderDetails=Workbook_1.getSheet("PlaceOrderDetails");
		int number_of_rows=PlaceOrderDetails.getPhysicalNumberOfRows();
		int number_of_columns=PlaceOrderDetails.getRow(0).getLastCellNum();
		String[][]placeorder=new String[number_of_rows-1][number_of_columns];
		for(int i=1;i<number_of_rows;i++)
		{
			for(int j=0;j<number_of_columns;j++)
			{	
				XSSFRow Row=PlaceOrderDetails.getRow(i);
				placeorder[i-1][j]=Row.getCell(j).toString();
			}
		}		
		return placeorder;
	}
	public String[][] ReadContactUsData() throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException
	{
		File file_1=new File("C:\\Users\\giga\\Desktop\\DemoBlaze.xlsx");
		XSSFWorkbook Workbook_1=new XSSFWorkbook(file_1);
		XSSFSheet ContactUs=Workbook_1.getSheet("ContactUs");
		int number_of_rows=ContactUs.getPhysicalNumberOfRows();
		int number_of_columns=ContactUs.getRow(0).getLastCellNum();
		String[][]contactus=new String[number_of_rows-1][number_of_columns];
		for(int i=1;i<number_of_rows;i++)
		{
			for(int j=0;j<number_of_columns;j++)
			{	
				XSSFRow Row=ContactUs.getRow(i);
				contactus[i-1][j]=Row.getCell(j).toString();
			}
		}		
		return contactus;
	}
}
