import java.util.ArrayList;


public class List {

	public static void main(String[] args) {
		ArrayList<Company> person = new ArrayList<Company>();
		person.add(new Company("Microsoft", 36));
		person.add(new Company("Apple", 20));
		person.add(new Company("Samsung", 19));
		int b = 0;
		for(int i = 0; i < person.size(); i++){
			int a = person.get(0).getNumber();
			if(a < person.get(i).getNumber()){
				a = person.get(i).getNumber();
				a = b;
			}
		}
		person.remove(b);
		for(Company c: person){
		System.out.println(c);
		}
		
		person.add(new Company("Google", 98));
		person.add(new Company("Asus", 6));
		
		int c = 0;
		String second = person.get(0).getName();
		for(int i = 0; i < person.size(); i++){
			String first = person.get(i).getName();
			if(first.length() > second.length()){
				second = first;
				c = i;
			}
		}
		person.remove(c);
		person.add(c ,new Company("NEW", 88));
		
		System.out.println();
		System.out.println();
		for(Company p: person){
			System.out.println(p);
			}
		}

}
