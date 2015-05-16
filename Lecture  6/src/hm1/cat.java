package hm1;

public class cat {
	String name;
	int age;
	
	public cat(){
		this.name = "";
		this.age = 0;
	}
	public cat(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void Say(){
		System.out.println("Hi! I am " + this.name);
		System.out.println("I am " + this.age + " years old.");
		System.out.println();
	}
	
}
