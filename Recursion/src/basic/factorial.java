package basic;

import java.util.Scanner;

public class factorial {

	public static int Fact(int n)
	{
		if(n==0)
		{
			return 1;
		}
		int smallNum = Fact(n-1);
		return n * smallNum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = Fact(n);
		System.out.println(ans);
		
		
	}

}
