package com.excel.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SheetTest {
public static void main(String[]args) throws Exception {
	File f = new File("C:\\Users\\Ramanichandaran M\\Desktop\\h.xlsx");
	FileInputStream f1 = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(f1);
	Sheet s = w.getSheet("detail");
	for(int i = 0;i<s.getPhysicalNumberOfRows();i++) {
		Row r = s.getRow(i);
			Cell c = r.getCell(2);
			System.out.println(c);
			c.setCellValue("USA");
			
		FileOutputStream d = new FileOutputStream(f);
		w.write(d);
			
		}
	}
}
