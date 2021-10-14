package pattern;

import java.util.Scanner;
public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int gap = n-1;
		for(int i = 0;i<n;i++)
		{
			for(int j =0;j<gap;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			gap--;
			System.out.println(" ");
		}
		
		int spc = 0;
		for(int i = n;i>0;i--)
		{
			for(int j =0;j<spc;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print("* ");
			}
			spc++;
			System.out.println(" ");
		}
	}
}


