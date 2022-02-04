package medium;

import java.util.Scanner;

public class LastIndex 
{
//	Coding Problem
//	Problem Name: Last index of x
//	Problem Level: MEDIUM
	public static int LastIndex(int arr[], int idx, int x)
	{
		if(idx == arr.length)
		{
			return -1;
		}
		int lsiX = LastIndex(arr,idx +1,x);
		if(lsiX==-1)
		{
			if(arr[idx]==x)
			{
				
				return idx;
			}
			else
			{
				return -1;
			}
		}
		else
		{
			return lsiX;	
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
		
		int fI = LastIndex(arr,0,x);
		System.out.println(fI);
	}

}
