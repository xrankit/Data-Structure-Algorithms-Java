package basicarray;
import java.util.Scanner;
public class largestElement {
	
	public static int[] inputArr()
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int intarr[] = new int[n];
		for(int i = 0; i< n; i++)
		{
			intarr[i] = sc.nextInt();
		}
		return intarr;
	}
	
	public static int largest(int intarr[])
	{
		int largest = intarr[0];
		for(int i =0;i<intarr.length;i++)
		{
			if(intarr[i]>=largest)
			{
				largest = intarr[i];
			}
		}
		return largest;
	}
	
	public static void printArray(int intarr[])
	{
		for(int i =0; i<intarr.length;i++)
		{
			System.out.print(intarr[i]+" ");
		}
		System.out.println();
	}
	
	public static void printLargest(int large)
	{
		System.out.println("largest number: "+ large);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = inputArr();
		printArray(arr);
		int large = largest(arr);
		printLargest(large);
	}

}
