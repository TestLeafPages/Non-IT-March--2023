package week3day2;

public class LearnString {

	public static void main(String[] args) {
		
		String name="vidya"; //literal way
		//vidyaR
		/*name = name.concat("R");//appending the text
		System.out.println(name);*/
		
		String name1="vidya";
		
		//using obj
		String s=new String("vidya");
		
		
		String str="emp123 #";//Sequence of character /Collection of characters
		
		System.out.println(name1==s);//boolean
		//with respect to String ,== will compare the memory address of String variables
		//compare the memory
		
		System.out.println(name1==name);
		
		//to compare the values of the String variables
		
   if(s.equals(name1)) {
	System.out.println("Both the values are same");
   }else {
	   System.out.println("Not same ");
   }
		
   
   
		
		
	}

}
