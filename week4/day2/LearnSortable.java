package week4dY2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnSortable {



	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions s=new Actions(driver);
		driver.switchTo().frame(0);
		
		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
	
		WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
		
		Point location = item4.getLocation(); //x and y
	int	x = location.getX();
	int y=location.getY();
		
		s.clickAndHold(item1).dragAndDropBy(item1, x, y).perform();
		

	
	}

}
