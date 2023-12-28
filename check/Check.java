import java.util.Scanner;
import java.util.Arrays;

	public class Check{

		public static void main(String... args){
		
		Scanner input = new Scanner(System.in);

int[] numbers = {1, 2, 3, 5, 7, 9, 20};
System.out.println("Enter number ");
int check = input.nextInt();

if (numbers[0] == check){
System.out.println("true at index " + 0);
}
else if (numbers[1] == check){
System.out.println("true at index " + 1);
}
else if (numbers[2] == check){
System.out.println("true at index " + 2);
}
else if (numbers[3] == check){
System.out.println("true at index " + 3);
}
else if (numbers[4] == check){
System.out.println("true at index " + 4);
}
else if (numbers[5] == check){
System.out.println("true at index " + 5);
}
else if (numbers[6] == check){
System.out.println("true at index " + 6);
}else{
System.out.println("It's not in the Array");
}


/*
for(int i =0; i < numbers.length; i++){
if(numbers[i] == check)
System.out.println("True" + numbers[3] );

}
*/
}
}

/*public static boolean check(){

int[] numbers = {1, 2, 3, 5, 7, 9, 20};

for(int i =0; i < numbers.length; i++){
if(numbers[i] == check)
System.out.println("True");



}

	}
*/