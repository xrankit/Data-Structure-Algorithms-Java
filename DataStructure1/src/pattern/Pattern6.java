package pattern;

import java.util.Scanner;
public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		5
//		***** *****
//		****   ****
//		***     ***
//		**       **
//		*         *
//		**       **
//		***     ***
//		****   ****
//		***** *****
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = n; i>0;i--)
		{
			for(int j = i; j>0;j--)
			{
				System.out.print("*");
			}
			for(int j=0;j<2*(n-i)+1;j++)
			{
                System.out.print(" ");
			}
			for(int k=i;k>0;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i<n;i++)
		{
			for(int j = i+1; j>0;j--)
			{
				System.out.print("*");
			}
			for(int j=2*(n-i)-1;j>0;j--)
			{
                System.out.print(" ");
			}
			for(int j = i+1; j>0;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
