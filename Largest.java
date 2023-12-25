import java.util.Scanner;
import java.util.Arrays;

	public class Largest{

		public static void main(String... args){
		
		Scanner input = new Scanner(System.in);
int maxNumber =0;
	// LOOP
int[] numbers = {1, 3, 5, 40, 8, 2};
for (int i =0 ; i < numbers.length; i++){

if (numbers[i] > maxNumber)
maxNumber =  numbers[i];

}

System.out.println("the largest number is: "+ maxNumber);
		
		}
	}

//public static void (int[] mumbers)
