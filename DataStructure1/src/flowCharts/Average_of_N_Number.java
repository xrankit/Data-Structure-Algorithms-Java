package flowCharts;

import java.util.Scanner;
public class Average_of_N_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of number taken : ");
		int N = sc.nextInt();
		int sum = 0;
		int[]arr = new int[N];
		System.out.println("Enter the number :  ");
		for(int i =0;i<N;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i<N; i++)
		{
			sum = sum + arr[i];
		}
		System.out.println("Sum of "+N+" number is "+sum);
		float average = sum/N;
		
		System.out.println("Average of "+ N + " number is " + average);
	}

}
