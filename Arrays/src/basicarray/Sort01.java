package basicarray;

import java.util.Scanner;

public class Sort01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i =0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		int i =0;
		int j = n-1;
		while(i<j)
		{
			if(arr[i]!=arr[j])
			{
				if(arr[i]<arr[j])
				{
					i++;
					j--;
				}
				else
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					i++;
					j--;
				}	
			} 
			else
			{
				if(arr[i]==0)
				{
					i++;
				}
				else
				{
					j--;
				}
			}
		}
		for(int l =0;l<n;l++)
		{
			System.out.print(arr[l]+" ");
		}
	 }
  }
	
}
