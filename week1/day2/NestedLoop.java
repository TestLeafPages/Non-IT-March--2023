package week1day1;

public class NestedLoop {

	public static void main(String[] args) {
		int week=3;
		int day =7;
		/*ctrl shift /
		 * week1 day1 day2 day3 day4 day5 day6 day7 
		 * 
		 * week2 day1 day2 day3 day4 day5 day6 day7
		 * 
		 * week3 day1 day2 day3 day4 day5 day6 day7
		 */
		
		for(int i=1;i<=3;i++) {//outer loop
			System.out.println("week "+i);
			for(int j=1;j<=7;j++) {//inner loop
				System.out.println("day" +j);
			}
		}
		
		
		
	}

}
