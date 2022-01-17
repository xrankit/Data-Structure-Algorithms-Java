package basicarray;
import java.util.Scanner;
public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int arr[] = new int[n1];
		int k =0;
		int n = n1-2;
		int sum = ((n)*(n+1))/2;
		for(int i =0;i<n1;i++)
		{
			arr[i] = sc.nextInt();
			k = k + arr[i];
		}
		
		System.out.println("--->"+k);
		System.out.println("--->"+sum);
		int duplicate = k-sum;
		System.out.println("--->"+duplicate);
	}

}
