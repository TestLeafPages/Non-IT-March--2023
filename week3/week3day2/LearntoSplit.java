package week3day2;

public class LearntoSplit {

	public static void main(String[] args) {
		
		String sen="Learning Java in Java Session";
		char[] charArray = sen.toCharArray();
		//Complete reverse of a sentence
		for(int i=charArray.length-1;i>=0;i--) {
			System.out.print(charArray[i]);
		}
		
		//reverse the words in sentence
		//expected Output
		//gninraeL avaJ ni avaJ noisseS
		
		//Learning ->string
		//Java
		//in
		//Java
		//session
		
		System.out.println();
		String[] split = sen.split(" ");
		
	     for(int i=0;i<=split.length-1;i++) {
	    	//split[0]-->Learning
	    	 char[] cha = split[i].toCharArray();
	    	 for(int j=cha.length-1;j>=0;j--)
	    	 {
	    		 System.out.print(cha[j]);
	    	 }
	    	 
	    	 System.out.print(" ");
	     }
		
		
		//step:1 -->split the sen
	     //Step:2 use for loop iterate to split array
	     //Step:3 conver the each word into chararray
	     //Step:4use for loop to reverse it
		
		
		

	}

}
