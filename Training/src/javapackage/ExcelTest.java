 package javapackage;
import java.io.File;
import java.io.FileInputStream; 
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTest {

	public static void main(String[] args) throws Exception {
		File src = new File("C:\\Users\\Admin\\Desktop\\Book1.xlsx");
		FileInputStream fis =new FileInputStream(src);
		
//		Workbook wbf = WorkbookFactory.create(fis);
//		Sheet s = wbf.getSheet("Sheet1");
//		Row r = s.getRow(1);
//		Cell c = r.getCell(0);
//		String value = c.getStringCellValue();
//		System.out.println("string  "+value);
		
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheet("Sheet1");
		System.out.println("string "+sheet.getRow(1).getCell(0).getStringCellValue());
		
		System.out.println(sheet.getPhysicalNumberOfRows());
		System.out.println(sheet.getFirstRowNum());
		System.out.println(sheet.getLastRowNum());
		
//		int row = (sheet.getLastRowNum()-sheet.getFirstRowNum())+1;
		int row =  sheet.getLastRowNum()+1;
		System.out.println(row);
		int coloumn = sheet.getRow(0).getLastCellNum();
		System.out.println(coloumn);
		
		for ( int i=0; i<row; i++) {
			for (int j=0; j<coloumn; j++) {
//				System.out.print(sheet.getRow(i).getCell(j).getStringCellValue());
				String s1 = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(s1+" ");
			}
			System.out.println();
		}
		
	}

}
