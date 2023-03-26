package week1day1;

public class LearnSwitch {

	public static void main(String[] args) {
		int day=6;
		String browser="Edge";
		switch(browser) {		
		case "FireFox":
		{
			System.out.println("Executed in Firefox");
			break;
		}
		case "Google":{
			System.out.println("Excuted the testcase in chrome");
			break;
		}
		default :
		{
			System.out.println("Nothing is matched");
			break;
		}
		
		
		
	}

}}
