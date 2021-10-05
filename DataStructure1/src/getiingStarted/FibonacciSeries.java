package getiingStarted;

import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i =0; i<t;i++)
		{
			int N = sc.nextInt();
			int f1 = 0;
			int f2 = 1;
			int fib = 0;
			System.out.print(f1);
			System.out.print(f2);
			for(int j=1;j<N-1;j++)
			{
				fib = f1 + f2;
				System.out.print(fib);
				f1 = f2;
				f2 = fib;
			}
			
		}
	}

}
