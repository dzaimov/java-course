package Exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class hm2 {

	private static BufferedReader bufferedReader;

	public static void main(String[] args) {
		try {
			readFile("text.txt");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void readFile(String fileName) throws MyException, IOException{		
		FileReader fileReader = new FileReader(fileName);
		
		bufferedReader = new BufferedReader(fileReader);

		while (bufferedReader.ready()) {
			String line = bufferedReader.readLine();
			if (line.charAt(line.length()-1)=='.' || (line.charAt(line.length()-1)=='!' || (line.charAt(line.length()-1)=='?'))){
				throw new MyException("SentenceNotCompletedException!");
		    }
		}			
		bufferedReader.close();

	        
	}
}
