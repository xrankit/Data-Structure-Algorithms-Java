package basicarray;

import java.util.Scanner;
public class functionToTakeInput {

	public static int[] arr()
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arrInt = new int[n];
		for(int i =0;i<n;i++)
		{
			arrInt[i] = sc.nextInt();
		}
		return arrInt;
	}
	
	public static void printArr(int arrInt[])
	{
		for(int i =0; i<arrInt.length; i++)
		{
			System.out.println(arrInt[i] + "\t");
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arri[] = arr();
		printArr(arri);
	}

}
