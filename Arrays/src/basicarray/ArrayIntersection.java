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
		
		int maxi = Integer.max(n,m);
		for(int i =0; i<maxi;i++)
		{
			
		}
	}

}
