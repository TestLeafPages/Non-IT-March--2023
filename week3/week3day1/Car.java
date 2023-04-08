package week3day1;

public class Car extends Vehicle{

	public void noOfWheels() {
		System.out.println("4 wheels");
	}
	
	
	public static void main(String[] args) {
		
		Car obj=new Car();
		obj.applyBrake();
		obj.noOfWheels();
		obj.soundHorn();
		obj.noOfSeats();
		obj.wipers();
		
		Auto au =new Auto();
		au.applyBrake();
		
		
		
	}
}
