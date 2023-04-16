package week4dY2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		//Simple alert
		//switching my control to alertbox		
		  Alert alert = driver.switchTo().alert(); //to get the text from the alert box
		  String text = alert.getText(); 
		  System.out.println(text); // 
		  alert.accept();
		 			
		//Confirmation alert		
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		alert.dismiss();
		
		
		//sweet alert-->we can inspect it
		
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
	//	driver.switchTo().alert().accept();
		driver.findElement(By.xpath("(//span[text()='Dismiss'])")).click();

		//Click on Prompt alert
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		
		alert.sendKeys("Vidya");
		System.out.println(alert.getText());
		alert.accept();
		
		String text2 = driver.findElement(By.id("confirm_result")).getText();
		System.out.println(text2);
		
		
		
	}

}
