package week3day2;

public class ReverseString {

	public static void main(String[] args) {
		String s="Testleaf";
		//faeltset
		//step:1 ->convert the string to char array
		
		char[] ch = s.toCharArray();
		//Step:2 -->iterate into each character from the end
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
		
		

	}

}
