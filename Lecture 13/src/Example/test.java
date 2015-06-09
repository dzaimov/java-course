package Example;

public class test {

	public static void main(String[] args) {
		
		
			try {
				Potrebitel potrebitel1 = new Potrebitel();
				
				potrebitel1.setEmail("zaimovgmail.com");
				potrebitel1.setPassword("abv4df");
			
			} catch (Exception e) {
				System.out.println(e.getMessage());

			}
	}
}
