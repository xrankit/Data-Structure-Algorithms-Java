package basic;

import java.util.Scanner;

public class PrintNumbers 
{
	public static void number(int n)
	{
		if(n>0)
		{
			number(n-1);
			System.out.print(n+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		number(n);
	}

}
