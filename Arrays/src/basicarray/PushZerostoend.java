package basicarray;

import java.util.Scanner;

public class PushZerostoend {

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
			int count =0;
			for(int i=0;i<n;i++)
			{
				if(arr[i]!=0)
				{
					arr[count]=arr[i];
					count++;
				}
			}
			while(count<n)
			{
				arr[count] = 0;
				count++;
			}
			for(int i =0;i<n;i++)
			{
				System.out.print(arr[i] + "\t");
			}
			
		}
	}
}
