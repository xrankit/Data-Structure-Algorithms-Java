package SearchingSorting;

import java.util.Scanner;

public class selectionsort {
	
	public static int[] SelectionSort(int arr[], int n)
	{
		int temp ;
		for(int i =0;i<n-1;i++)
		{
			for(int j =i;j<n;j++)
			{
				if(arr[i]>=arr[j])
				{
					temp = arr[i];
					arr[i]=arr[j];
					arr[j] = temp;
				}
//				if(arr[i]<=arr[j])
//				{
//					temp = arr[i];
//					arr[i]=arr[j];
//				8	arr[j] = temp;
//				}
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
			int arr1[]  = SelectionSort(arr,n);
			for(int i =0;i<n;i++)
			{
				System.out.print(arr1[i]+" ");
				
			}
			 
			
		}
	}

}
