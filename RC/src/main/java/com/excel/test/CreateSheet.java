package com.excel.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateSheet {
	public static void main(String[]args) throws Exception {
		File f = new File("C:\\Users\\Ramanichandaran M\\Desktop\\k.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet("Ramani");
		Row r = s.createRow(3);
		Cell c = r.createCell(3);
		c.setCellValue("Hi All");
		FileOutputStream d = new FileOutputStream(f);
		w.write(d);
	}

}
