package week2day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import week1day1.Car;

public class LaunchBrowser {

	public static void main(String[] args) {

	
		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		EdgeDriver ed=new EdgeDriver();			
		/*
		 * Car obj=new Car(); obj.applygear(1);	
		 *
		 */
		//load the url to open a appln
		driver.get("https://www.facebook.com/");
		
		ed.get("https://www.facebook.com/");
		
		//illegalStateException
	}

}
