package basic;

import java.util.Scanner;

public class SumofNaturalNumber {

		public static int SumNaturalNumber(int n)
		{
			if(n==1)
			{
				return 1;
			}
			return n+SumNaturalNumber(n-1);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = SumNaturalNumber(n);
		System.out.println(sum);
	}

}
