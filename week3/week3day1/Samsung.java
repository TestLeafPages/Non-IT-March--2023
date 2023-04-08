package week3day1;

public class Samsung extends AndroidTv implements Android {

	public static void main(String[] args) {
		Samsung s=new Samsung();
		s.openApp();
		s.watchVideo();
	
	}

	@Override
	public void watchVideo() {
		System.out.println("Watching Video");
		
	}

	
	

	

}
