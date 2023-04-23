package staticData;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {

	
	
	
	@Test(dataProvider="fetchData")
	public  void runCreateLead(String cname,String fname,String lname,String phn) {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phn);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
	}
	
	
	//step-1
	
	@DataProvider(name="fetchData")
	public String[][] sendData() {
	
		//step2-declare a 2D string array
		//row-column
		String[][] data= new String[2][4];
		//index start with '0'
		//2-0,1
		//4-0,1,2,3
		
		data[0][0]="TestLeaf";
		data[0][1]="Vinoth";
		data[0][2]="s";
		data[0][3]="9876567689";
		
		data[1][0]="TestLeaf";
		data[1][1]="Gokul";
		data[1][2]="j";
		data[1][3]="7878797625";
		
		//step-3 return object
		
		return data;
		
		
		
	}

}
