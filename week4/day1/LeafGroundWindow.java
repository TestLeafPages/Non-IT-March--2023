package week4day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println(driver);
        //it holds the current window address/handle
        String windowHandle = driver.getWindowHandle();
        System.out.println(windowHandle);

    //   driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
        
    //   System.out.println( driver.getTitle());
       //it holds multiple window handles/address
		/*
		 * Set<String> windowHandles = driver.getWindowHandles(); //converting the set
		 * to list List<String> wh=new ArrayList<String>(windowHandles);
		 * 
		 * for (String wind : windowHandles) { System.out.println(wind); }
		 * System.out.println(windowHandles.size());
		 * 
		 * driver.switchTo().window(wh.get(1)); System.out.println(driver.getTitle());
		 * driver.switchTo().window(wh.get(0));//back to parent
		 * System.out.println(driver.getTitle());
		 *///trying to get the child window-->NoSuchWindow Exception
	//click on Open Multiple 
	   driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
	   Set<String> windowHs = driver.getWindowHandles();
	   List<String> whs=new ArrayList<String>(windowHs);
       System.out.println(driver.getTitle());
    //   driver.close();//close the current active window
	   driver.switchTo().window(whs.get(1)); //first child Window
       System.out.println(driver.getTitle());
       driver.switchTo().window(whs.get(2));//SecondChild window
       System.out.println(driver.getTitle());
     //  driver.switchTo().window(whs.get());//thirdChild window

	 //  driver.quit();//closes all the opened windows/tab
	  //how to close all the child window except the parent window
	
	for(int i=1;i<whs.size();i++) {
		driver.switchTo().window(whs.get(i));
		driver.close();
	}
	   
	driver.switchTo().window(whs.get(0));
	   System.out.println(driver.getTitle());
	}
	
       
       

	}

