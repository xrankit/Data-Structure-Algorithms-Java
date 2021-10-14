package pattern;

import java.util.Scanner;
public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int gap = 0; 
		int star = n;
		for(int i =0;i<n;i++)
		{
			for(int j =0;j<gap;j++)
			{
				System.out.print("\t");
			}
			for(int j =star;j>0;j--)
			{
				System.out.print("*\t");
			}
			gap++;
			star--;
			
			System.out.println();
		}
	}

}
