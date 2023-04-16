package week4dY2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions s=new Actions(driver);
		
		WebElement kidsHover = driver.findElement(By.linkText("Kids"));
		WebElement tops = driver.findElement(By.linkText("Tops"));

		//mouse hover action
		s.moveToElement(kidsHover).click(tops).perform();
		
	}

}
