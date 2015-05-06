import java.util.Scanner;

public class class10 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in, "UTF-8");
		
		System.out.println("Please enter number(0-999): ");
		int a = input.nextInt();
		if(a >= 0 && a <= 999){
			int hundred = a / 100;
			if(hundred != 0){
				switch(hundred){
				case 1: 
					System.out.print("one hundred");
					break;
				case 2: 
					System.out.print("two hundred");
					break;
				case 3: 
					System.out.print("three hundred");
					break;
				case 4: 
					System.out.print("four hundred");
					break;
				case 5: 
					System.out.print("five hundred");
					break;
				case 6: 
					System.out.print("six hundred");
					break;
				case 7: 
					System.out.print("seven hundred");
					break;
				case 8: 
					System.out.print("eight hundred");
					break;
				case 9: 
					System.out.print("nine hundred");
					break;
				}
				int b = (a / 10) % 10;
				if(b > 1){
					switch(b){
					case 2:
						System.out.print(" and twenty");
						break;
					case 3:
						System.out.print(" and thirty");
						break;
					case 4:
						System.out.print(" and fourty");
						break;
					case 5:
						System.out.print(" and fifty");
						break;
					case 6:
						System.out.print(" and sixty");
						break;
					case 7:
						System.out.print(" and seventy");
						break;
					case 8:
						System.out.print(" and eighty");
						break;
					case 9:
						System.out.print(" and ninety");
						break;
					}
					switch(a % 10){
					case 0:
						break;	
					case 1: 
						System.out.print("one");
						break;						
					case 2:
						System.out.print("two");
						break;
					case 3:
						System.out.print("three");
						break;
					case 4:
						System.out.print("four");
						break;
					case 5:
						System.out.print("five");
						break;
					case 6:
						System.out.print("six");
						break;
					case 7:
						System.out.print("seven");
						break;
					case 8:
						System.out.print("eight");
						break;
					case 9:
						System.out.print("nine");
						break;				
					}
				}
				else if(b == 1){
					switch(a % 10){
					case 0:
						System.out.print(" and ten");
					case 1: 
						System.out.print(" and eleven");
						break;						
					case 2:
						System.out.print(" and twelve");
						break;
					case 3:
						System.out.print(" and thirteen");
						break;
					case 4:
						System.out.print(" and fourteen");
						break;
					case 5:
						System.out.print(" and fifteen");
						break;
					case 6:
						System.out.print(" and sixteen");
						break;
					case 7:
						System.out.print(" and seventeen");
						break;
					case 8:
						System.out.print(" and eighteen");
						break;
					case 9:
						System.out.print(" and nineteen");
						break;
					}
				}
				else if(b == 0){
					switch(a % 10){
				case 1: 
					System.out.print(" and one");
					break;						
				case 2:
					System.out.print(" and two");
					break;
				case 3:
					System.out.print(" and three");
					break;
				case 4:
					System.out.print(" and four");
					break;
				case 5:
					System.out.print(" and five");
					break;
				case 6:
					System.out.print(" and six");
					break;
				case 7:
					System.out.print(" and seven");
					break;
				case 8:
					System.out.print(" and eight");
					break;
				case 9:
					System.out.print(" and nine");
					break;
					}
				}	
			}
			else{
				
				if(a / 10 != 0 && a / 10 != 1){
					switch(a / 10){
							
					case 2:
						System.out.print("twenty");
						break;
					case 3:
						System.out.print("thirty");
						break;
					case 4:
						System.out.print("fourty");
						break;
					case 5:
						System.out.print("fifty");
						break;
					case 6:
						System.out.print("sixty");
						break;
					case 7:
						System.out.print("seventy");
						break;
					case 8:
						System.out.print("eighty");
						break;
					case 9:
						System.out.print("ninety");
						break;
					}
					switch(a % 10){
					case 0:
						break;
					case 1: 
						System.out.print("one");
						break;						
					case 2:
						System.out.print("two");
						break;
					case 3:
						System.out.print("three");
						break;
					case 4:
						System.out.print("four");
						break;
					case 5:
						System.out.print("five");
						break;
					case 6:
						System.out.print("six");
						break;
					case 7:
						System.out.print("seven");
						break;
					case 8:
						System.out.print("eight");
						break;
					case 9:
						System.out.print("nine");
						break;
					}					
				}
				else if(a / 10 == 1 ){
					switch(a % 10){
					case 0: 
						System.out.print("ten");
						break;
					case 1: 
						System.out.print("eleven");
						break;						
					case 2:
						System.out.print("twelve");
						break;
					case 3:
						System.out.print("thirteen");
						break;
					case 4:
						System.out.print("fourteen");
						break;
					case 5:
						System.out.print("fifteen");
						break;
					case 6:
						System.out.print("sixteen");
						break;
					case 7:
						System.out.print("seventeen");
						break;
					case 8:
						System.out.print("eighteen");
						break;
					case 9:
						System.out.print("nineteen");
						break;
					}					
				}	
				else{
					switch(a){
					case 0:
						System.out.print("zero");
						break;
					case 1: 
						System.out.print("one");
						break;
					case 2: 
						System.out.print("two");
						break;
					case 3: 
						System.out.print("three");
						break;
					case 4: 
						System.out.print("four");
						break;
					case 5: 
						System.out.print("five");
						break;
					case 6: 
						System.out.print("six");
						break;
					case 7: 
						System.out.print("seven");
						break;
					case 8: 
						System.out.print("eigth");
						break;
					case 9: 
						System.out.print("nine");
						break;
					}
				}
			}
		}
		else{
			System.out.println("Error!");
		}
		input.close();
	}
}