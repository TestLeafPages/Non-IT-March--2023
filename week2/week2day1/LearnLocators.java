package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {

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
		 
		 //to close the browser
		 driver.close();
		 
	}

}
