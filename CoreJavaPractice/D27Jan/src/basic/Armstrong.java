package basic;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, sum = 0, x, p;
		System.out.println("Enter a number: ");
		n = sc.nextInt();
		
		p = n;
		
		while(n>0)
		{
			x = n%10;
			sum = sum + x * x * x;
			n = n /10;
		}
		
		if(p == sum)
		{
			System.out.println(p + " is armstrong number");
		}
		
		else
		{
			System.out.println(p + " is not armstrong number");
		}
		
		
		sc.close();

	}

}
