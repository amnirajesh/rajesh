package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel {
	public static void main(String[] args) throws IOException {
		File file = new File(
				"C:\\Users\\RAJESH J\\eclipse-workspace\\FullCourse\\DataDriven\\excel\\New Microsoft Excel Worksheet.xlsx");

		FileInputStream stream = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(stream);
		Sheet sheet = w.getSheet("Sheet1");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(1);
		System.out.println(cell);
		int numberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println(numberOfRows);
		
		
		
		
		
	}

}
