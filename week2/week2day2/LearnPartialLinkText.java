package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnPartialLinkText {

	public static void main(String[] args) {
		//Launch the browser -ctrl shift o (for import shortcut)
		ChromeDriver driver =new ChromeDriver();
		//load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//to apply global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
		
		//to maximize the web page
		driver.manage().window().maximize();
		//locate the username element
		WebElement username = driver.findElement(By.id("username"));
		// to type /enter the input
		username.sendKeys("demosalesManager");
		String attribute = username.getAttribute("class");
		System.out.println(attribute);
		username.clear();
		username.sendKeys("DemoSalesManager");		
	     //locate the password  element and enter into it
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click on login button
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
		 //click on CRM/SFA
		 driver.findElement(By.partialLinkText("CRM")).click();
		 
		 WebElement leads = driver.findElement(By.linkText("Leads"));
		
		 String text = leads.getText();
		 System.out.println(text);
		 leads.click();
		 
		 driver.findElement(By.linkText("Create Lead")).click();
		 
         WebElement cname = driver.findElement(By.id("createLeadForm_companyName"));
         cname.sendKeys("Testleaf");
         String typedText = cname.getAttribute("value");//to fetch the typed text from the application
         System.out.println(typedText);
		 
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vidya");
		 
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		 
		 driver.findElement(By.name("submitButton")).click();
		 String view = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		 System.out.println(view);
		 
		 driver.findElement(By.linkText("10390")).click();
		 
	}

}
