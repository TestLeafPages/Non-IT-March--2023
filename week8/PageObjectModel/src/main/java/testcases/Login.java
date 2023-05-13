package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;
import pages.WelcomePage;

public class Login extends ProjectSpecificMethod {

	
	@Test
	public void runLogin() {
		
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
		.verifyHomePage();
		
		
	}
	
}
