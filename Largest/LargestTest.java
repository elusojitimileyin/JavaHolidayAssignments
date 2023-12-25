import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class LargestTest{

@Test
public void testLargest(){

	int maxNumber =0;

	int[] numbers = {1, 3, 5, 40, 8, 2};
	for (int i =0 ; i < numbers.length; i++){

		if (numbers[i] > maxNumber){
			maxNumber =  numbers[i];
		}
	}
 assertEquals(40, maxNumber);
}
}