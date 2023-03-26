package week1day1;

public class Factorial {

	public static void main(String[] args) {
		//5!-->1*2*3*4*5
		int input =8;
		int fact=1;
		
		for(int i=1;i<=input;i++) {
			fact=fact*i;
			//1*1=1
			//1*2=2
			//2*3=6
			//6*4=24
			//25*5=120
			
		}
		System.out.println(fact);
	}

}
