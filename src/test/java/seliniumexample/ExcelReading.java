package seliniumexample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelReading {

	public static void main(String[] args) throws IOException, InterruptedException {

		String filePath="C:\\Prajwal";
		String fileName="Book1.xlsx";
		String sheetName="Sheet1";

	    File file = new File(filePath+"\\"+fileName);
	    FileInputStream inputStream = new FileInputStream(file);
	    Workbook workBook = null;
	    String fileExtensionName = fileName.substring(fileName.indexOf("."));
	    if(fileExtensionName.equals(".xlsx")){
	    	workBook = new XSSFWorkbook(inputStream);
	    }
	    else if(fileExtensionName.equals(".xls")){
	    	workBook = new XSSFWorkbook(inputStream);
	    }
	    Sheet sheet = workBook.getSheet(sheetName);
	    Row row = sheet.getRow(0);
	    //int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
	            String username=row.getCell(0).getStringCellValue();
	            String password=row.getCell(1).getStringCellValue();

		System.setProperty("webdriver.chrome.driver", "C:\\Prajwal\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
	
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@name='login']")).click();	//button[@name='login']
		//input[@name='email']

	   
	}	
}