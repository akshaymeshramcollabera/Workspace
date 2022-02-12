package streamProgram;

//Java code for IntStream.sum() to
//find the sum of elements
//divisible by 3 in given range
import java.util.*;
import java.util.stream.IntStream;

public class GFG {

	public static void main(String[] args) {
		// Using IntStream.sum() to find
        // sum of elements divisible by 3
        // in given range
        int sumOfElements = IntStream.range(2, 10)
                        .filter(num -> num % 3 == 0)
                        .sum();
 
        // Displaying the calculated sum
        System.out.println(sumOfElements);

	}

}
