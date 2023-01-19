package Utilities_for_Selenium;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	//creating a constructor same as class name 
	
	/*public ExcelUtils() {
		
		
	}
	*/

	public static void main(String[] args) {

		getRowCount();
		getCellDataString(0,0);
		getCellDataNumber(1,1);

	}

	public static void getRowCount()  {     //https://prnt.sc/FudU6MUlNO7p

		try {

			projectPath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectPath+"/Excel/data.xlsx");
			sheet = workbook.getSheet("Sheet1");
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("Number of rows : "+rowCount);
		} 

		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}

	public static void getCellDataString(int rowNum, int colNum) //parameterize the functions
	
	{

		try {
			projectPath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectPath+"/Excel/data.xlsx");
			sheet = workbook.getSheet("Sheet1");
			String cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println(cellData);


		}
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}
	}
	public static void getCellDataNumber(int rowNum, int colNum) {

		try {
			projectPath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectPath+"/Excel/data.xlsx");
			sheet = workbook.getSheet("Sheet1");
			double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(cellData);


		}
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}
	}
}

