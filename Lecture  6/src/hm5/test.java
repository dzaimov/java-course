package hm5;

import java.util.Scanner;


public class test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		CelsiusToFahrenheit convertor = new CelsiusToFahrenheit();
		System.out.println("Please enter celsius: ");
		double c = input.nextInt();
		double f = convertor.CelToFahr(c);
		System.out.println("celsius=" + c); 
		System.out.println("fahrenheit=" + f);
		input.close();
	}

}
