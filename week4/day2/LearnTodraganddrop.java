package week4dY2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnTodraganddrop {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions s=new Actions(driver);
		WebElement drag = driver.findElement(By.xpath("//span[text()='Drag me around']"));
		
		s.dragAndDropBy(drag, 110,200).perform();
		
		WebElement dragTarget=driver.findElement(By.xpath("//p[text()='Drag to target']"));
		WebElement drophere=driver.findElement(By.xpath("//p[text()='Drop here']"));

		s.dragAndDrop(dragTarget,drophere).perform();
		
		
		
		
	}

}
