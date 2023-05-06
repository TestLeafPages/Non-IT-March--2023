package week7day1;

public class LearnConstructorChaining extends LearnConstructor{
	
	
	
	 public LearnConstructorChaining(int x,int y) {
		 super(); 
		  System.out.println(x +" "+y);
	  }
	
	 
	 public void add() {
		 super.add();
		  System.out.println("From normal method");
	  }
	

	public LearnConstructorChaining() {
		System.out.println("From default constructor");
	}
	
	
	public LearnConstructorChaining(String name) {
		this();//to call current class constructor/methods/variables
		System.out.println("From "+name+" constructor");
	}
	
	public static void main(String[] args) {
	//	new LearnConstructorChaining();
		new LearnConstructorChaining("Parametrized");
		
		new LearnConstructorChaining(1,5);
		
		new LearnConstructorChaining().add();
		
		
	}

}
