package week3day1;

public class ExecutionClass {
//concrete class
	public static void main(String[] args) {
		
		Car obj=new Car();
		obj.applyBrake();
		obj.noOfWheels();
		obj.soundHorn();
				

		Auto au=new Auto();
		au.applyBrake();
		au.soundHorn();
		au.wheelCount();
		
	}

}
