package SearchingSorting;

import java.util.Scanner;

public class bubbleSort {
	
	public static int[] BubbleSort(int arr[], int n)
	{
		int temp;
		for(int i =0; i<n-1;i++)
		{
			for(int j =0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i =0; i<n ;i++)
			{
				arr[i] = sc.nextInt();
			}
			int arr1[]  = BubbleSort(arr,n);
			for(int i =0;i<n;i++)
			{
				System.out.print(arr1[i]+" ");
				
			}
			 
			
		}
	}

}
