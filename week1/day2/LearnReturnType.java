package week1day1;

public class LearnReturnType {
	//classlevel dec /instance variable/global variable
	int x=10; 
	int y=20;

	public int add() {
		int a=10;//local variable
		int b=15;
		System.out.println(a+b+x);
		return b;
	}
	
	public int sub() {
		int a=15;
		int b=5;
		
		return a-b;
	}
	
	public String fnName() {
		String name= "sangeetha";
		return name;
		
	}
	public void function(int b,int a) {		
		
		System.out.println(b + a -y);
		
	}
	
	public static void main(String[] args) {
		
		LearnReturnType cal=new LearnReturnType();
		cal.add();
		System.out.println(cal.sub());
		int result= cal.sub();
		//result -->local variable
		System.out.println(result+2);
		cal.function(4, result);		
		cal.function(10, 20);
		cal.function(25, 30);
		
		System.out.println(cal.x);
		int y2 = cal.y;
		
		cal.function(result, y2);
	}

}
