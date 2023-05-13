package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.ReadExcel;



public class ProjectSpecificMethod {

	public RemoteWebDriver driver;
	public String filename;
	/*
	 * public EdgeDriver driver1; public FirefoxDriver driver2;
	 */
	@Parameters({"browser"})
	@BeforeMethod
	public void preCOndition(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();	
		}
		else if(browser.equalsIgnoreCase("edge")) {		
		driver =new EdgeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
		driver=new FirefoxDriver();
		}		
		System.out.println(driver);		
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}		
	
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException {		
		return ReadExcel.readData(filename);			
		
	}
	
	
	
	
}
