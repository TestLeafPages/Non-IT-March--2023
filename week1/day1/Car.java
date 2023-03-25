package week1day1;

public class Car {
	
	//applygear
			//applybreak
			//soundHorn
			//useWipper
  public void applygear(int gear) {
		System.out.println("Apply gear" +gear);
	}		
	
  public void soundHorn(String loud) {
	  System.out.println("Horn"+loud);
  }
	
  private void useWipper() {
	  System.out.println("Its raining");//information in the console
  }
  
  protected int noOfWheels() {
	 int wheelsCount=4;
	return wheelsCount;
  }
  
  void engineCapacity() {
	  System.out.println("25l");
  }

	public static void main(String[] args) {
 
	//create a reference/object/instance for the class
		
		Car hyundai=new Car();
		hyundai.applygear(3);
		hyundai.engineCapacity();
		//ctrl 2 l
		/*
		 * int noOfWheels = hyundai.noOfWheels(); System.out.println(noOfWheels);
		 */
		hyundai.applygear(4);
		System.out.println(hyundai.noOfWheels());
		
		Car honda =new Car();		 
		honda.applygear(1);
		honda.engineCapacity();
		honda.noOfWheels();		
		honda.useWipper();
	
		
		
	}

}
