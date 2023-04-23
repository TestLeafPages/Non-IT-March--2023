package learnattributes;

import org.testng.annotations.Test;

public class LearnDependsOnMethods {

	//default value={}-String[]
	@Test()
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
	
	@Test(priority=-1)
	public void mergeLead() {
		System.out.println("mergeLead");
	}

}
