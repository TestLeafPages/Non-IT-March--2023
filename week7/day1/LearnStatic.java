package week7day1;

public class LearnStatic extends Learnfinal {
		
	String s; //non -static variables
    int  k;
   
    static{//block
    System.out.println("From static Block");
    }
    
    {
    	System.out.println("From Non static block");
    	
    }
    
    static String v;
	public void callName() {//non -static method
		int z;
		System.out.println(k);
	}
	
	
	/*
	 * public final void add() { int y=5; x=x+y; }
	 */
	
	public static void callM2() {
		System.out.println("From static method");
	}
	
	public static void main(String[] args) {
		//you cannot call the noraml varibles or methods in your static method
		
		LearnStatic learnStatic = new LearnStatic();//Constructor -->initializes the default value to the class variables
		learnStatic	.callName();
	
		LearnStatic learnStatic2 = new LearnStatic();
		
		System.out.println(v);		
		callM2();
		

	}

}
