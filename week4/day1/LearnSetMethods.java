package week4day1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSetMethods {

	public static void main(String[] args) {
		
		//Set<String>mentors =new HashSet<String>();
		//Set<String>mentors =new LinkedHashSet<String>();
		Set<String>mentors =new TreeSet<String>();
		mentors.add("vidya");
		mentors.add("Ranjani");
		mentors.add("vinoth");
		mentors.add("Gokul");
		mentors.add("Gokul");		
		System.out.println(mentors);
		//not possible to fetch the data using getMethod ->no index
		/*
		 * for(int i=0;i<mentors.size();i++) {
		 * 
		 * mentors. }
		 */
		//(WrapperClass variable: setName
		
		for (String names : mentors) {
			System.out.println(names);
		}
		
		
	}

}
