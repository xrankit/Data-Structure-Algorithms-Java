package recursion1a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfDigits {
	
	public static int SumofDigits(int n)
	{
		if(n==0)
		{
			return 0;
		}
		int r = n%10;
		return r+SumofDigits(n/10);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		//Problem Name: Sum of digits (recursive)
		//Problem Level: MEDIUM
		//Problem Description: #### Write a recursive function that returns the sum of the digits of a given integer.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(SumofDigits(n));
	}

}
