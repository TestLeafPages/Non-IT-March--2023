package week3day2;

public class FindCount {

	public static void main(String[] args) {
		String s="Testleaf Learning";
		//count the occurence of e
		//Method 1
		int count=0;
		for(int i=0;i<=s.length()-1;i++) {
			if(s.charAt(i)=='t') {
				//charAt()=e -->e==e
				count++;//+1+1
			}
		}
		
		System.out.println("The occurence of t in the String "+s +" "+count);
		
		
		
		

		/*
		 * Classroom:2
		 *************
		 * Find the count of given character in a String String input="TestLeaf"; //To
		 * get the count of e; Goal: To understand the String, loop, if a) Create a
		 * class by name: FindCharCount (with main method) initialize the count variable
		 * count =0; b)Convert the String to character array (use toCharArray) c)Use
		 * forloop to iterate each character in the array d)Compare with the input with
		 * the required character using if condition (==) e)if matches, keep adding the
		 * count. Finally, print the count. f) Run and Confirm the correct character
		 * count is printed in console
		 */
		//Method:2
		int counter=0;
		char[] charArray = s.toCharArray();
		
		for(int i=0;i<=charArray.length-1;i++) {
			if(charArray[i]=='e') {
				counter++;
			}
		}
		
		System.out.println("The occurence of e in the String "+s +" "+counter);

		
		
		
		

	}
	
	
	

}
