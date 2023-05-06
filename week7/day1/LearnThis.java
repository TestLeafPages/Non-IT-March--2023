package week7day1;

public class LearnThis {

	
	int id;
	//id =1;
	String name;
	
	
	public void empDetails(int id ,String name) {
		this.id=id; 
		this.name=name;
		System.out.println(id+"-->"+name);
		System.out.println(this.id);
	}
	
	public void empName() {
		this.empDetails(5, "Indhiresh");
	}
	
	public static void main(String[] args) {
		new LearnThis().empDetails(1 ,"Sangeetha");		
		new LearnThis().empName();

	}

}
