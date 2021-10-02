package flowCharts;

import java.util.Scanner;
public class Even_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int x = N % 2;
		
		if(x==0)
		{
			System.out.println(N + " is even number");
		}
		else
		{
			System.out.println(N + " is odd number");
		}
	}

}
