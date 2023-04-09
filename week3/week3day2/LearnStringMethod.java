package week3day2;

public class LearnStringMethod {

	public static void main(String[] args) {
		
		String s="Testleaf";
		
		boolean contains = s.contains("Leaf");
		System.out.println(contains);
		
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		
		String upperCase = lowerCase.toUpperCase();
		System.out.println(upperCase);
		
		//part of the value from the given index
		String substring = s.substring(4);
		System.out.println(substring);
		//to retrieve the value between the range
		String substring2 = s.substring(2,6);
		System.out.println(substring2);
		
		String replace = s.replace("f","2");
		System.out.println(replace);
		//not -^
		String empid="Emp12#";		
		
		
		String emp = empid.replaceAll("[^0-9]", "");		
		System.out.println(emp);
		
		String replaceAll = replace.replaceAll("[^0-9]","");
		System.out.println(replaceAll);
		
		System.out.println(replaceAll+2);

		
		//to convert a string into int
		
		int parseInt = Integer.parseInt(replaceAll);
		System.out.println(parseInt+2);
		
	}

}
