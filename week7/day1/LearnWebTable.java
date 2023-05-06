package week7day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.leafground.com/table.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Identify the table
		WebElement table = driver.findElement(By.xpath("(//table[@role='grid'])[2]"));
		
		//Fetching data from row1 col2 -->country of first row
		String text = driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody/tr[1]/td[2]")).getText();
		System.out.println(text);
		System.out.println("************************");
		/*
		 * 1,2
		 *  2,2 
		 *  3,2 
		 *  4,2
		 */
		List<WebElement> rows = driver.findElements(By.xpath("(//table[@role='grid'])[2]/tbody/tr"));
		int rsize = rows.size();
		System.out.println("No.Of Rows " +rows.size());
		
		List<WebElement> columns = driver.findElements(By.xpath("(//table[@role='grid'])[2]/tbody/tr[1]/td"));
		int csize = columns.size();
		System.out.println("No.Of Columns " +columns.size());
		
		System.out.println("************************");
		//to get the values from all rows of column2
		for(int i=1;i<=rsize;i++) {
			String col2Value = driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody/tr["+i+"]/td[2]")).getText();
		    System.out.println(col2Value);
		}		
	
		System.out.println("************************");
		//from one row of all column
		for(int i=1;i<=csize;i++) {
			String row1Value = driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody/tr[1]/td["+i+"]")).getText();
		    System.out.println(row1Value);
		}
		

		System.out.println("************************");
		// To get all the datas from the table
		for(int i=1;i<=rsize;i++) {
			for(int j=1;j<=csize;j++) {
			String allValues = driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody/tr["+i+"]/td["+j+"]")).getText();
		    System.out.println(allValues);
		}}
		
		
	}

}
