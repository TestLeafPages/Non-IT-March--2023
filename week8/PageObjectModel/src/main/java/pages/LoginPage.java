package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod {
	
	
	//assign the global driver instance to local instance
	public LoginPage(RemoteWebDriver driver) {
		this.driver=driver;
	}

	//create methods for each webelement 
	//meaningful name along with action -->action+webelement
	public LoginPage enterUsername() {		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
	//	LoginPage ob=new LoginPage();
		//return new LoginPage();
		return this; //calling current page constructor
	}	
	
	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}
	
	
	public WelcomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(driver);
		
	}
	
	
	//chain of action
	//do method chaining
}
