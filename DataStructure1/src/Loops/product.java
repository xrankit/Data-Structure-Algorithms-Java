package Loops;

import java.util.Scanner;
public class product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int prod = 1;
		for(int i =n;i>0;i = i/10)
		{
			int res = 0;
			res = i%10;
			sum = sum + res;
			prod = prod * res;
		}
		System.out.println("the sum of number is " + sum);
		System.out.println("the product of number is " + prod);
		int sub = 0;
		sub = prod - sum;
		System.out.println("the subtract of product and sum is " + sub);
		
	}

}
