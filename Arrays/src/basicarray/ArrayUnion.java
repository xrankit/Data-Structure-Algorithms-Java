package basicarray;

import java.util.Scanner;
import java.util.Arrays;
public class ArrayUnion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr1[] = new int[n];
		for(int i =0;i<n;i++)
		{
			arr1[i] = sc.nextInt();
		}
		Arrays.sort(arr1);
		int m = sc.nextInt();
		int arr2[] = new int[m];
		for(int i =0;i<m;i++)
		{
			arr2[i] = sc.nextInt();
		}
		Arrays.sort(arr2);
		
		//two pointer algorithm
		
		int i =0,j=0;
		while(i<n && j<m)
		{
			if(arr1[i]<arr2[j])
			{
			    System.out.println(arr1[i]);
			    i++;
			}
			
			else if(arr1[i]>arr2[j])
			{
				System.out.println(arr2[j]);
				j++;
			}
			else
			{
				System.out.println(arr2[j]);
				j++;
				i++;
			}
			
		}
		while (i < n)
		{
			System.out.println(arr1[i]);
			i++;
		}
            
		
        while (j < m)
        {
            System.out.println(arr2[j]);
            j++;
        }
	}

}
