package week1day1;

public class LearnnestedIf {

	public static void main(String[] args) {
		int num=0;
		int x=5;
		String name="Testleaf";
				
		if(num>0) {
			System.out.println("The given number "+num+" is positive");
		}else if(num<0) {
			System.out.println("The given number "+num +" is negative");
		}else if(num==0) {
			System.out.println("The given number "+num+ " is neutral");
		}else {
			System.out.println("Check your input");
		}

	}

}
