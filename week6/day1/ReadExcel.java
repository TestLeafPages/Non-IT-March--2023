package week5day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
//convert the main method into normal method with return type  String[][]
	public static String[][] readData(String filename) throws IOException {
		XSSFWorkbook book = new XSSFWorkbook("./data/"+filename+".xlsx");
		XSSFSheet sheet = book.getSheetAt(0);
		XSSFRow row = sheet.getRow(1);
		int rowCount = sheet.getLastRowNum();
		int columCount = row.getLastCellNum();

		// Create a 2D String array
		String[][] data = new String[rowCount][columCount];// empty array with the size of excel row and colunm size

		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j <columCount; j++) {
				String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				// Send the value of stringCellValue to the string[][] data
				data[i - 1][j] = stringCellValue; // [i=1]
				// [1,0] [1,1] [1,2] [1,3]
				// data[1][0]=Testleaf
				// i-1
				// data[0][0]=Testleaf
				// data[0][1]=vidya
				// data[0][2]=R
				// data[0][3]=99
				// [0,0] [0,1] [0,2] [0,3]
				// [1,0] [1,1] [1,2] [1,3]
			}
		} // 1

		book.close();
		return data;
	}
	
	
	
}
