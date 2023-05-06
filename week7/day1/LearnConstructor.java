package week7day1;



public class LearnConstructor {

	int rollNo;
	String empName;
	
	
	  public LearnConstructor() {//no arg constructor /default Constructor
	   System.out.println("From Default Constructor");
	  }
	 
	  
	  public LearnConstructor(int x,int y) {//Parametrized 
		  System.out.println(x +" "+y);
	  }
	
	  public void add() {
		  System.out.println("From normal method of Parent");
	  }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//initializes the object/instance of the class
		LearnConstructor learnConstructor = new LearnConstructor();
		learnConstructor.add();
		LearnConstructor learnConstructor2 = new LearnConstructor(2,5);
		learnConstructor2.add();
		
		new LearnConstructor(3,10);
	
	}

}
