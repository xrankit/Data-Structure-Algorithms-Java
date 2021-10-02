package flowCharts;

import java.util.*;
public class Max_of_three_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("The greatest of all number is "+ a);
		}
		else if(b>a && b>c)
		{
			System.out.println("The greatest of all number is " + b );
		}
		else
		{
			System.out.println("The greatest of all number is " + c);
		}
	}

}
