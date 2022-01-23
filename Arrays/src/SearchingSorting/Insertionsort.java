package SearchingSorting;

import java.util.Scanner;

public class Insertionsort {
	
	public static int[] InsertionSort(int arr[], int n)
	{
		
		for(int i =0; i<n-1;i++)
		{
			int temp=arr[i];
			 int j = i - 1;  
			  
		        while(j>=0 && temp <= arr[j]) 
		        {    
		            arr[j+1] = arr[j];     
		            j = j-1;    
		        }    
		        arr[j+1] = temp;    
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
			int arr1[]  = InsertionSort(arr,n);
			for(int i =0;i<n;i++)
			{
				System.out.print(arr1[i]+" ");
				
			}
			 
			
		}
	}

}
