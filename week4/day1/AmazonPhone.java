package week4day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class AmazonPhone {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//serach for the phones
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones",Keys.ENTER);		
		List<WebElement> phonePrice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		List<Integer> pho=new ArrayList<Integer>();
		for(int i=0;i<phonePrice.size();i++) {
			String text = phonePrice.get(i).getText();
			//17,999-->17999 String
			String replace = text.replace(",", "");
			System.out.println(replace);
			if(!replace.isBlank()) {
			{int parseInt = Integer.parseInt(replace);
				pho.add(parseInt);
			}
		}		
		System.out.println(pho);
		//to conver list to set
		Set<Integer> phoprice=new LinkedHashSet<Integer>(pho);
		
		/*
		 * for(Integer ph:pho) { phoprice.addAll(pho); }
		 * 
		 *
		 */
		
		 System.out.println(phoprice);
		
		//class
		Collections.sort(pho);
		Integer min = Collections.min(pho);
		Integer max = Collections.max(pho);
		System.out.println("the min price is "+min +"  the max price is "+max);		
		//to find the lowest price->number
		
	}
	}
}
