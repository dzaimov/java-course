package hm5;

public class CelsiusToFahrenheit {
	double celsius;
	double fahrenheit;
	
	public double CelToFahr(double celsius){
		fahrenheit = (celsius * 2) + 30;
		return fahrenheit;
	}
}
