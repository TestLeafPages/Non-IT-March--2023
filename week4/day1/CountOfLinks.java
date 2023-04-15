package week4day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountOfLinks {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement firstLink = driver.findElement(By.xpath("//li/a"));
		System.out.println(firstLink.getText());
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//li/a"));
		System.out.println(allLinks.size());
		
		WebElement secondLink = allLinks.get(1);
		secondLink.click();
		
	}

}
