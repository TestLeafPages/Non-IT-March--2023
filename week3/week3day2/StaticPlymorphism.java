package week3day2;

public class StaticPlymorphism {
//Method Overloading -->work within a class with same method name but will 
	//have different arg
	public void empDetails(String name ,int empid) {
		System.out.println(name +"  " +empid);
	}
	
	
     public void empDetails(long phno, String desgn) {
		
    	 System.out.println(phno +" "+ desgn);
	}
     
     public void empDetails() {
 		
    	 System.out.println("Learning Overloading");
	}
   
	
	public static void main(String[] args) {
	
		StaticPlymorphism empdt=new StaticPlymorphism();
		empdt.empDetails(903434021894l, "Tester");
		empdt.empDetails("Punita", 25);
		

	}

}
