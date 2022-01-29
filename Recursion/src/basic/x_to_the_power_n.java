package basic;

import java.util.Scanner;

public class x_to_the_power_n 
{
	public static int X_power_n(int x, int n)
	{
		if(n==0)
		{
			return 1;
		}
		int ans = X_power_n(x,n-1);
		return x * ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int ans = X_power_n(x,n);
		System.out.println(ans);
	}

}
