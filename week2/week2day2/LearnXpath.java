package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {
      ChromeDriver driver =new ChromeDriver();
      driver.get("http://leaftaps.com/opentaps/control/main");
      driver.manage().window().maximize();
      driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
      
	}

}
