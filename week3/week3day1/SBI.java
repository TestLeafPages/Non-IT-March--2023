package week3day1;

public class SBI implements RBI,Loan,GoldLoan {

	@Override
	public void withDrawal() {
		System.out.println("More than 2 L ,needs pan card");
	}

	@Override
	public void kycDoc() {
		System.out.println("aadhar");
		
	}
	
	@Override
	public void securityDoc() {
            System.out.println("EC");		
	}	
	
	public void motorLoan()
	{
		System.out.println("Loan for vehicle");
	}
	
	public static void main(String[] args) {
			
		SBI bank=new SBI();
		bank.kycDoc();
		bank.withDrawal();
		bank.securityDoc();
		bank.roi();
		
		RBI reserve=new SBI();
		RBI a=new Axis();
	
		
	}

	@Override
	public void roi() {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	
	

}
