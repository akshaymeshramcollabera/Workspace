package basic;

public class SumOfNumbers {

	public static void main(String[] args) {
		int n = 15;
        int sum = 0;
        for(int i = n;i>=0;i--)
            sum = sum + i;
        System.out.println("Sum = "+ sum);
	}

}
