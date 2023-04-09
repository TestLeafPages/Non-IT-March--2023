package week3day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		int x=10;
		//int marks=80,40,97,68,75;
		// to declare the values using array literal
		//datatype []  variable={values}
		
		int[] marks= {80,90,75,85,99};
		
		String subjects[]= {"English","Maths","Science","Lang","CSC"};
		//index ->position of the element stored in the mem
		//index -->starts from zero
		
		//0-->80
		//1-->90
		//2-->75
		//3-->85
		//4-->99
		
		
		System.out.println(marks[2]);
		System.out.println(subjects[2]);
		
		
		//Using object
		//int[] marks=new int[size];
		int[] scores=new int[5];
		scores[0]=67;//1
		scores[1]=78;//2
		scores[2]=99;//3
		scores[3]=56;//4
		scores[4]=79;//5 
	//	scores[5]=99;//ArrayIndexOutOfBoundsException
		
	//	System.out.println(scores[5]);
		//length /number of elements in the array
		int length = scores.length;
		System.out.println(length);
		
		int length2 = marks.length;
		System.out.println(length2);
		
		
		//store the n data in an array , retrive the data-->n-1
		
		System.out.println(scores[4]);
		
		System.out.println(scores[0]+scores[1]);
		
		//to print all the values of array		
		for(int i=0;i<=length-1;i++) {
			System.out.println(scores[i]);
		}
		
		//Arrange the elements in the array
		
		Arrays.sort(scores);
		
		for(int i=0;i<=length-1;i++) {
			System.out.println(scores[i]);
		}
		
		
	}

}
