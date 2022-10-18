package com.My_Maven_Projects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Create_Excel_Sheet {
	public static void pass_Data() throws IOException {
		File file=new File("C:\\Users\\SRIDHAR GUNASEKARAN\\eclipse-workspace\\maven_day_one\\target\\EXAM_RESULTS.xlsx");
		FileInputStream f= new FileInputStream(file);
		Workbook w = new XSSFWorkbook(f);
		Sheet CS = w.createSheet("NOONE");
		Row CR = CS.createRow(0);
		Cell CC = CR.createCell(0);
		CC.setCellValue("MY LIFE");
		w.getSheet("NOONE").getRow(0).createCell(1).setCellValue("MY RULES");
		w.getSheet("NOONE").createRow(1).createCell(0).setCellValue("NO PAIN");
		w.getSheet("NOONE").getRow(1).createCell(1).setCellValue("NO GAIN");
		w.getSheet("NOONE").createRow(2).createCell(0).setCellValue("BE COOL");
		w.getSheet("NOONE").getRow(2).createCell(1).setCellValue("BE HAPPY");
		
		
		
	 FileOutputStream OS = new FileOutputStream(file);
	 w.write(OS);
	 w.close();

	}
public static void main(String[] args) throws IOException {
	pass_Data();
}
}
