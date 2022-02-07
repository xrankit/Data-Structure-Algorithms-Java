package practiceQuestions;

import java.util.Scanner;

public class GatherRainWater1 
{
	public static int maxWater(int[] arr, int n)
	{
	    int sum = 0;
	    
	    for(int i = 1; i < n - 1; i++)
	    {
	        int left = arr[i];
	        for(int j = 0; j < i; j++)
	        {
	            left = Math.max(left, arr[j]);
	        }
	        
	        int right = arr[i];
	        for(int j = i + 1; j < n; j++)
	        {
	            right = Math.max(right, arr[j]);
	        }
	        
	        sum = sum +  Math.min(left, right) - arr[i];
	    }
	    return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) 
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i =0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
			System.out.println(maxWater(arr,n));
		}
	}
}
