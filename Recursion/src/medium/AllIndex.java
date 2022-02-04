package medium;

import java.util.Scanner;

public class AllIndex 
{
	public static int[] AllIndex(int arr[], int idx, int x,int pos)
	{
		if(idx == arr.length)
		{
			return new int[pos];
		}
		
		if(arr[idx]==x)
		{
			 int[] iarr = AllIndex(arr, idx+1,  x, pos+1);
			 iarr[pos]=idx;
			 return iarr;
		}
		else
		{
			int[] iarr = AllIndex(arr, idx+1,  x, pos);
			return iarr;
		}
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
		int x = sc.nextInt();
		
		int iarr[] = AllIndex(arr,0,x,0);
		if(iarr.length==0)
		{
			System.out.println();
			return;
		}
		for(int i =0;i<iarr.length;i++)
		{
		    System.out.println(iarr[i]);
		}
	}

}
