package Exceptions;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class hm1 {

	public static void main(String[] args) {
		try {
			String test = readFile("test.txt");
			writeFile("test1.txt", test);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static String readFile(String fileName)
	        throws FileNotFoundException, IOException {		
		Path path = Paths.get(fileName);
		List<String> lines = Files.readAllLines(path);
		return lines.toString();
	}
	
	public static void writeFile(String fileName, String str)
	        throws FileNotFoundException, IOException {
		FileWriter fileStream = new FileWriter(fileName);
		BufferedWriter writer = new BufferedWriter(fileStream);
		writer.write(str);
		writer.close();		
	}
}