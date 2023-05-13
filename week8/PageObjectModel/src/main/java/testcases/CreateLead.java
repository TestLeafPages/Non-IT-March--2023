package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;
import pages.WelcomePage;

public class CreateLead extends ProjectSpecificMethod {

	@BeforeTest
	public void setData() {
		filename="CreateLeadTestdata";
	}
	
	
	@Test(dataProvider="fetchData")
	public void runCreate(String cname, String fname,String lname,String phno) {
		
		//create a object for the class of first action
		
		/*
		 * LoginPage ob=new LoginPage();
		 * 
		 * ob.enterUsername(); ob.enterPassword(); ob.clickLogin();
		 * 
		 * WelcomePage wp=new WelcomePage(); wp.clickCrmsfa();
		 */
		
		LoginPage ob=new LoginPage(driver);
		ob.enterUsername()
		.enterPassword()
		.clickLogin()
		.clickCrmsfa()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyname(cname)
		.enterFirstName(fname)
		.enterLastName(lname)
		.clickCreate()
		.verifyLeadName();
		
		
	}
	
}
