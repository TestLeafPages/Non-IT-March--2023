package week3day1;

public class Vehicle {
//Grandfather
	public void applyBrake() {
		System.out.println("Applied brake");
	}
	
	public void soundHorn() {
		System.out.println("Sound Horn");
	}
	
	//cannot be accessed outside the package but can be accessed in extend classes
	protected void noOfSeats() {
		System.out.println("6 Seater");
	}
	
	void  wipers() {
		System.out.println("Its raining");
	}
	
}
