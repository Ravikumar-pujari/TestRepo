package javapackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice11 {

	public static void main(String[] args) throws Exception {
	File file =new File("D:\\Book1.xlsx");
	FileInputStream fis =new FileInputStream(file);
	
//	Workbook wb = WorkbookFactory.create(fis);
//	Sheet sh =wb.getSheet("Sheet1");
//	Row rw = sh.getRow(0);
//	Cell cl =rw.getCell(0);
//	String value = cl.getStringCellValue();
//	System.out.println(value);
	
	XSSFWorkbook wb1 = new XSSFWorkbook(fis);
	XSSFSheet sh1 = wb1.getSheet("Sheet1");
	XSSFRow rw1 = sh1.getRow(1);
	XSSFCell cl1 = rw1.getCell(0);
	String valu = cl1.getStringCellValue();
	System.out.println(valu);
	
	System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
	
	int row = sh1.getLastRowNum()+1;
	System.out.println(row);
	int coloumn = rw1.getLastCellNum();
	System.out.println(coloumn);
	
	for (int i=0; i<row; i++ ) {
		for (int j=0; j<coloumn; j++) {
			System.out.print(sh1.getRow(i).getCell(j).getStringCellValue()+" ");	
		}
		System.out.println();
	}
	}

}
