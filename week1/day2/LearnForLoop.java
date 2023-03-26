package week1day1;

public class LearnForLoop {

	public static void main(String[] args) {
		
		
		for(int i=1;i<=15;i++) {
			if(i==3) {//1==3 2==3 3==3
				System.out.println("three");
			//	break; //-->stops the execution
				continue;
			}
			System.out.println(5*i);//skipped
		}
		
	}

}
