package training;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int[n];
		for(int i =0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int array_sum =0;
		for(int i =0;i<n;i++)
		{
			array_sum = array_sum+arr[i];
		}
		
		
		int avg = array_sum/n;
		System.out.println(avg);
		
		int count =0;
		
		for(int i =0;i<n;i++)
		{
			if(arr[i]==avg)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
