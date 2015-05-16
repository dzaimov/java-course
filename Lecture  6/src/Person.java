
public class Person {
	private String name;
	private int age;
	private String email;
	
	public Person(){
		this.name = "";
		this.age = 0;
		this.email = "";
	}
	
	public Person(String name, int age, String email){
		this.name = name;
		this.age = age;
		this.email = email;
	}
	
	public void print(){
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
		System.out.println("E-mail:" + email);
		System.out.println();
	}
}
