package week5day2;

public class LearnStatic {
//static doesnt required an explicit reference for it 
	static String name="vidya";
	public static int add(int x) {
		return x;
	}
		
	public int sub(int y) {
		return y;
	}
	
	public static void main(String[] args) {
	
		LearnStatic obj=new LearnStatic();
		LearnStatic obj1=new LearnStatic();

		obj.sub(5);
		add(10);
		
		
	}

}
