package pages;

import base.ProjectSpecificMethod;

public class FindLeadsPage extends ProjectSpecificMethod{

	
	public void searchLead() {
		
	}
	
	public ViewLeadPage clickFirstResulting() {
		//click first lead id
		return new ViewLeadPage(driver);
	}
}
