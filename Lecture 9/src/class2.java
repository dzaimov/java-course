import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;


public class class2 {

	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in, "UTF-8");
			FileReader fileReader = new FileReader("countries.txt");
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while (bufferedReader.ready()) {
					String line = bufferedReader.readLine();
					System.out.println(line);						
			}
			
			bufferedReader.close();

			FileWriter fileStream = new FileWriter("cities.txt");
			
			BufferedWriter writer = new BufferedWriter(fileStream);

			
			for (int i = 0; i < 5; i++) {
				System.out.println("Enter capital: ");
				String capital = input.next();
				writer.write(capital);
				writer.newLine();
			}
			
			writer.close();
			input.close();
			
		} 
		catch (Exception e) {
			System.out.println("Error.");
			System.out.println(e.getMessage());
			System.exit(0);
		}
}
	}
	