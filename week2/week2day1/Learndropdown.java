package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Learndropdown {

	public static void main(String[] args) throws InterruptedException {
		 
		//Launch the browser -ctrl shift o (for import shortcut)
		ChromeDriver driver =new ChromeDriver();
		//load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//to maximize the web page
		driver.manage().window().maximize();
		//locate the username element
		WebElement username = driver.findElement(By.id("username"));
		// to type /enter the input
		username.sendKeys("demosalesManager");
		username.clear();
		username.sendKeys("DemoSalesManager");		
	     //locate the password  element and enter into it
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click on login button
		 driver.findElement(By.className("decorativeSubmit")).click();
		 //get the title of the current web page
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		 // to click on hyperlink -->linktext
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 
		 String Home = driver.getTitle();
		 System.out.println(Home);

		 Thread.sleep(3000);
		 //Click on leads link
		 driver.findElement(By.linkText("Leads")).click();
		 
		 //click on createlead
		 driver.findElement(By.linkText("Create Lead")).click();
		 
		 
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Tesstleaf");
		 
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vidya");
		 
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		 
		 //locate the drop down element first
		 
	//	 WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		 //to handle the dropdown
		 Select dd=new Select(driver.findElement(By.id("createLeadForm_dataSourceId")));	
		 Thread.sleep(3000);
		 dd.selectByIndex(3);
		 
		 //to locate the webelement marketCampaign
		 WebElement market = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		 //Create object for the select class
		 Select marketdd=new Select(market);
		 marketdd.selectByValue("CATRQ_AUTOMOBILE");
		 
		 Thread.sleep(3000);
		 marketdd.selectByVisibleText("Car and Driver");
		 
		 
		 //to close the browser
		// driver.close();
		 
	}

}
