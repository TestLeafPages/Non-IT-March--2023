package week3day1;

public class  Axis  extends LoanDetails implements RBI,FD {

	@Override
	public void withDrawal() {
		System.out.println("More than 10L needs pan card");
		
	}

	@Override
	public void kycDoc() {
		System.out.println("PaySlip");
		
	}

	public void fdLimit() {
		System.out.println("25l");
	}

	@Override
	public void surity() {
		// TODO Auto-generated method stub
		
	}
	
	
	public static void main(String[] args) {
	//	LoanDetails ld=new LoanDetails(); not allowed
		
		Axis a=new Axis();
		a.kycDoc();
		a.paySlip();
		
	}
	
	
}
