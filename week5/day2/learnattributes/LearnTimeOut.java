package learnattributes;

import org.testng.annotations.Test;

public class LearnTimeOut {

	//default value =0
	
	@Test(timeOut=500)
	public void createLead() {
		System.out.println("createLead");
	}

	@Test(dependsOnMethods="createLead")
	public void EditLead() {
		System.out.println("EditLead");
	}
	
	@Test(dependsOnMethods= {"createLead","mergeLead"})
	public void deleteLead() {
		System.out.println("deleteLead");
	}
	@Test()
	public void mergeLead() {
		System.out.println("mergeLead");
	}
}
