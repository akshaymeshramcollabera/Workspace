package string;

import java.util.Scanner;

public class LengthOfString {

	public static void main(String[] args) {
		String s = new String();
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a string");
        s = scn.nextLine();
        System.out.println("  "+s);
        System.out.println("length:"+s.length());
	}

}
