package basicarray;
import java.util.Arrays;
import java.util.Scanner;
public class FindUnique {
	
	public static void unique(int arr[])
	{
		int s = 0;
		for(int i =0;i<arr.length;i=i+1)
		{
//			if(arr[i]==arr[i+1])
//			{
//				continue;
//			}
				s = s ^ arr[i];
				System.out.println(s);
		}
		System.out.println(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int []arr = new int[n];
			for(int i =0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
			unique(arr);
			t--;
		}
	}

}
