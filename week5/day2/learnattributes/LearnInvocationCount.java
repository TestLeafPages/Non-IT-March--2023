package learnattributes;

import org.testng.annotations.Test;

public class LearnInvocationCount {
	//defaultvalue=1
	//threadpoolsize will work based on invocationCount
	//threadpoolsize default value=0
	
	
	@Test(invocationCount=4,threadPoolSize=2)
	public void createLead() {
		System.out.println("createLead");
	}

	@Test(invocationCount=4)
	public void EditLead() {
		System.out.println("EditLead");
	}
	
	@Test
	public void deleteLead() {
		System.out.println("deleteLead");
	}
}
