package practiceQuestions;

import java.util.Scanner;

public class GatherRainWater {
	
	public static int SecLarge(int arr[], int n)
	{
		int large = Math.max(arr[0], arr[1]);
		int secLarge =Math.min(arr[0], arr[1]);
		
		for(int i = 2; i<n; i++)
		{
			if(large < arr[i])
			{
				secLarge = large;
				large = arr[i];
			}
			else if(large > arr[i] && arr[i]> secLarge)
			{
				secLarge = arr[i];
			}
		}
		return secLarge;
	}
	
	public static int largest(int intarr[])
	{
		int largest = intarr[0];
		for(int i =0;i<intarr.length;i++)
		{
			if(intarr[i]>=largest)
			{
				largest = intarr[i];
			}
		}
		return largest;
	}

	public static void main(String[] args) 
	{
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
			int sum =0;
			int secLarge = SecLarge(arr,n);
			for(int i=0;i<n;i++)
			{
				if(secLarge==arr[i])
				{
					break;
				}
				if(secLarge >arr[i])
				{
					sum = sum + (secLarge-arr[i]);
				}
			}
			System.out.println("sum is "+sum);
		}

	}
}
