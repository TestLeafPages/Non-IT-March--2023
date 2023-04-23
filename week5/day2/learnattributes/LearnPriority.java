package learnattributes;

import org.testng.annotations.Test;

public class LearnPriority {
	
	//priority- default value=0
	//negative number also
	//-10,-2,0,5,3,6
	
	@Test(priority=1)
	public void createLead() {
		System.out.println("createLead");
	}

	@Test(priority=-1)
	public void EditLead() {
		System.out.println("EditLead");
	}
	
	@Test
	public void deleteLead() {
		System.out.println("deleteLead");
	}
	
	@Test(priority=-3)
	public void mergeLead() {
		System.out.println("mergeLead");
	}

}
