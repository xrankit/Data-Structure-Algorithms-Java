package Functions;

import java.util.Scanner;
public class countingumber {
	
	public static void countingNumber(int low, int high)
	{
		if(low<=high)
		{
			int count = 0;
			for(int i = low; i<=high;i++)
			{
				System.out.println(i);
			}
		}
		else
		{
			 System.out.println(low);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int low = sc.nextInt();
		int high = sc.nextInt();
		countingNumber(low, high);
		
	}

}
