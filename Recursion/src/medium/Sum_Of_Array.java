package medium;

import java.util.Scanner;

public class Sum_Of_Array {
	
	public static int SumArray(int arr[], int n)
	{
		if(n<=0)
		{
			return 0;
		}
		return (arr[n-1] + SumArray(arr, n-1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i =0; i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println(SumArray(arr,n));
	}

}
