package basic;

import java.util.Scanner;

public class Number_of_digits 
{
	public static int numberOfDigits(int n)
	{
		
		if(n/10==0)
		{
			return 1;
		}
		return 1 + numberOfDigits(n/10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = numberOfDigits(n);
		System.out.println(ans);
	}

}
