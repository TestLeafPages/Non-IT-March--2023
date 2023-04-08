package week3day1;

public class BMW extends Car{
	
	public void modernFeartures() {
		System.out.println("Auto gear");
	}

	public static void main(String[] args) {
		BMW bmw=new BMW();
		bmw.applyBrake();
		bmw.soundHorn();
		bmw.noOfWheels();
		bmw.modernFeartures();
		

	}

}
