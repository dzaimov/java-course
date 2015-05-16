package Employee;

	public class Policeman extends Employee {
		String rang;
		
		public Policeman(){
			super();
			this.rang = "";
		}
		public Policeman(int hours, double salary, String rang){
			super(hours, salary);
			setRang(rang);
		}
		
		public String getRang(){
			return rang;
		}
		public void setRang(String rang){
			this.rang = rang;
		}
		
		public void sayRang(){
			System.out.println("My rang is " + this.rang);
			System.out.println();
		}
}
