package week4day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafGroundDd {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Select dd=new Select(driver.findElement(By.className("ui-selectonemenu")));
		List<WebElement> options = dd.getOptions();
		int size = options.size();
		System.out.println(size);		
		WebElement option1 = options.get(2);
		option1.click();
		
		for(int i=0;i<options.size();i++) {
			String text = options.get(i).getText();
			System.out.println(text);
		}
		
		
		
	}

}
