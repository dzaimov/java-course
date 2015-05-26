
public class Test {

	public static void main(String[] args) {
		Student[] array = new Student[5];
		array[0] = new Student("Denis", "Zaimov", 5012, 49);
		array[1] = new Student("Dimitur", "Kirqkov", 5014, 59);
		array[2] = new Student("Nikolay", "Dobrev", 5052, 68);
		array[3] = new Student("Stanimir", "Trufenev", 5872, 99);
		array[4] = new Student("Dimitur", "Stoqnov", 3674, 36);
		
		for(int i = 0; i < 5; i++){
			System.out.println(array[i].toString());
			
			
		}
	}

}
