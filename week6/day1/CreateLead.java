package week5day2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass{	
	//Create a method
	
	@BeforeTest
	public void setFile() {	
	 filename="CreateLeadTestdata";
	
	}
	
	@Test(dataProvider="fetchData")
	public  void runCreateLead(String cname,String fname,String lname,String phn) {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phn);
		driver.findElement(By.name("submitButton")).click();
		
		text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
	}
	
	
	//Xml-->@BeforeSuite -->@BeforeTest -->@BeforeClass-->@BeforeMethod-->@Test -->@AfterMethod
	
	/*
	 * @DataProvider(name="fetchData") public String[][] sendData() throws
	 * IOException { // ReadExcel data=new ReadExcel(); // String[][] readData =
	 * ReadExcel.readData(); return ReadExcel.readData(filename);
	 * 
	 * 
	 * 
	 * }
	 */
	
}
//[1,0] [1,1] [1,2] [1,3]