package Employee;

public class Inharitance {
	public static void main(String[] args) {
		
		Policeman p = new Policeman(56, 1400, "Sergeant");	
		p.info();		
		p.sayRang();
		
		Doctor d = new Doctor(45, 2000, 8, 9);	
		d.info();		
		d.docWork();

	}

}
