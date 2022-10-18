package com.My_Maven_Projects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Get_Excel_Sheet {
	
	public static void get_All() throws IOException {
		System.out.println("GET ALL");
		System.out.println("--- ---");
		File file= new File("C:\\Users\\SRIDHAR GUNASEKARAN\\eclipse-workspace\\maven_day_one\\target\\EXAM_RESULTS.xlsx");
		FileInputStream f = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(f);
		Sheet sheetAt = w.getSheetAt(0);
		int NOR = sheetAt.getPhysicalNumberOfRows();
		System.out.println("   EXAM RESULT");
		System.out.println("   ---- ------");
		for (int i = 0; i < NOR; i++) {
			Row row = sheetAt.getRow(i);
		int NOC = row.getPhysicalNumberOfCells();
		for (int j = 0; j < NOC; j++) {
			Cell cell = row.getCell(j);
			CellType Type = cell.getCellType();
			if (Type.equals(Type.STRING)) {
				String STV = cell.getStringCellValue();
				System.out.print(STV);
			}
			else if(Type.equals(Type.NUMERIC)){
				double NCV = cell.getNumericCellValue();
				int d= (int) Math.round(NCV);
				System.out.println(d);
			}}}
		}
	public static void get_Perticular() throws IOException{
		System.out.println("");
		System.out.println("GET PERTICULAR");
		System.out.println("--- ----------");
		System.out.println("");
		File file= new File("C:\\Users\\SRIDHAR GUNASEKARAN\\eclipse-workspace\\maven_day_one\\target\\EXAM_RESULTS.xlsx");
		FileInputStream f = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(f);
		Sheet sheetAt = w.getSheetAt(0);
		Row row = sheetAt.getRow(5);
		Cell cell = row.getCell(1);
		CellType Type = cell.getCellType();
		if (Type.equals(Type.STRING)) {
			String STV = cell.getStringCellValue();
			System.out.print(STV);
		}
		else if(Type.equals(Type.NUMERIC)){
			double NCV = cell.getNumericCellValue();
			int d= (int) Math.round(NCV);
			System.out.println("   MY SCORE = "+d);

		}
		
	}
	public static void main(String[] args) throws IOException {
		get_All();
		get_Perticular();
	}
}
