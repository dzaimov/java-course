import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;


public class hm6 {
	public static void main(String[] args) {
		String line=null;
			try {
			
			FileReader fileReader = new FileReader("text.txt");
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while (bufferedReader.ready()) {
				line = bufferedReader.readLine();
				line = line.replaceAll("\\.", "");
				line = line.replaceAll("\\,", "");
				FileWriter fileStream = new FileWriter("text1.txt", true);				
				BufferedWriter writer = new BufferedWriter(fileStream);
					writer.write(line);
					writer.newLine();
				
				writer.close();
				
			}
			bufferedReader.close();
			
		} catch (Exception e) {
			System.out.println("Error .");
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}
}

