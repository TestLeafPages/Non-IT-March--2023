package week4dY2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseActions {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/menu.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//To do right click of the element
		//step:1-->locate the element
		//step:2 -->Instantiate the Action class
		//strp:3 -->call the actions class method to do right click;
		
		WebElement customer = driver.findElement(By.xpath("//span[text()='Customers']"));
		WebElement save = driver.findElement(By.xpath("(//span[text()='Save'])[2]"));
		WebElement over = driver.findElement(By.xpath("//a/span[text()='Overview']"));

		Actions build=new Actions(driver);
		
		//build.contextClick(customer).perform();
		
		build.contextClick(customer).pause(2000).click(save).perform();		
		build.doubleClick(over).perform();
		Thread.sleep(3000);
		WebElement contextMenu = driver.findElement(By.xpath("//h5[text()='Context Menu']"));

		build.scrollToElement(contextMenu).perform();
		System.out.println(contextMenu.getText());
		
	}

}
