package learnattributes;

import org.testng.annotations.Test;

public class LearnEnabled {

	//defalut value= true
	//ingore some tc we use enabled
	
	@Test(priority=-1,enabled=false)
	public void createLead() {
		System.out.println("createLead");
	}

	@Test()
	public void EditLead() {
		System.out.println("EditLead");
	}
	
	@Test
	public void deleteLead() {
		System.out.println("deleteLead");
	}
}
