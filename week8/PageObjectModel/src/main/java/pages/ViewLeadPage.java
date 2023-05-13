package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class ViewLeadPage extends ProjectSpecificMethod{
	
	
	public ViewLeadPage(RemoteWebDriver driver) {
		this.driver=driver;		
	}
	
	public ViewLeadPage verifyLeadName() {
	String	text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	System.out.println(text);
	return this;
	}

}
