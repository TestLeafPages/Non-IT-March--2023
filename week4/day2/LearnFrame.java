package week4dY2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Switch To frame
		// using index-->starts zero
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		// get out of the frame to the main Content of the web page
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		WebElement browser = driver
				.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']/following-sibling::span"));
		driver.executeScript("arguments[0].click();", browser);
		
		  driver.switchTo().frame(1); String text =
		  driver.findElement(By.xpath("//button[text()='Count Frames']")).getText();
		  System.out.println(text); driver.switchTo().defaultContent(); 
		  //to Switch into nested frame
		  List<WebElement>Outerframe =
		  driver.findElements(By.xpath("(//iframe)"));
		  
		  int size = Outerframe.size(); 
		  System.out.println("Number of frames" +size);	  	  
		  
		  driver.switchTo().frame(2); 
		  driver.switchTo().frame("frame2");
		  driver.findElement(By.id("Click")).click();
		  
		  
		  //switch the driver control to the immediate frame(parent Frame)
		  //driver.switchTo().parentFrame();
		  
		 

	}

}
