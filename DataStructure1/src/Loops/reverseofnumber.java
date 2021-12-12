package Loops;

import java.util.Scanner;

public class reverseofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int ans = 0;
		while(n!=0)
		{
			int digit = n%10;
			if(ans< Integer. MIN_VALUE || ans > Integer. MAX_VALUE)
			{
				System.out.println("0");
			}
			ans = (ans*10) + digit;
			n=n/10;
		}
		System.out.println(ans);
	}

}
