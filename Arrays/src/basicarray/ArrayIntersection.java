package basicarray;
import java.util.Scanner;
public class ArrayIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr1[] = new int[n];
		for(int i =0;i<n;i++)
		{
			arr1[i] = sc.nextInt();
		}
		
		int m = sc.nextInt();
		int arr2[] = new int[m];
		for(int i =0;i<m;i++)
		{
			arr2[i] = sc.nextInt();
		}
		int t = Integer.max(m,n);
		int temp[]= new int[t];
		
		for(int i =0; i<n;i++)
		{
			for(int j = 0; j<m;j++)
			{
				if(arr1[i]==arr2[j])
				{
					 System.out.println(arr1[i]);
				}
				
			}
		}
	}

}
