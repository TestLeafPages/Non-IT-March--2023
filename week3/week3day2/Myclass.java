package week3day2;

public class Myclass extends MethodOverriding{

	
	//Method Overriding  -->same method name with same arg in different classes
	//works with inheritance
	public void house() {
		super.house();
	//super ->keyword in java supports to call the parent class methods/variables
		System.out.println("Built as duplex home");
	}
		
	public void loan(long lakhs) {
		System.out.println(lakhs);
	}
	
	public void parentclassMethods() {
		super.house();
		super.loan(30);
	}
	
	
	
	
	public static void main(String[] args) {	
		Myclass call=new Myclass();
		call.house();
		call.loan(12);
		call.parentclassMethods();
		
	}

}
