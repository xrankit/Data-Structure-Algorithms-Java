package Loops;

import java.util.Scanner;

public class operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new  Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
//		checking the operators and or not xor.
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(~a);
		System.out.println(~b);
		System.out.println(a^b);
		
//		left shift & right shift operator
		
		System.out.println(a<<1);
		System.out.println(b<<2);
		System.out.println(a>>1);
		System.out.println(b>>2);
	}

}
