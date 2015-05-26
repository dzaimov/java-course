import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class hm7 {
	public static void main(String[] args) {
		String line=null;
		int count = 0;
			try {
			
			FileReader fileReader = new FileReader("text.txt");
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while (bufferedReader.ready()) {
					line = bufferedReader.readLine();
					count++;
					if(count % 2 == 0){
						FileWriter fileStream = new FileWriter("test.txt", true);
						
						BufferedWriter writer = new BufferedWriter(fileStream);
							writer.write(line);
							writer.newLine();
						
						writer.close();
					}
					else{
						FileWriter fileStream = new FileWriter("test1.txt", true);
						
						BufferedWriter writer = new BufferedWriter(fileStream);
							writer.write(line);
							writer.newLine();
						
						writer.close();
					}
			}
			
			bufferedReader.close();
			
		} catch (Exception e) {
			System.out.println("Error while reading a file.");
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}
}
