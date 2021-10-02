package flowCharts;

import java.util.Scanner;
public class Positive_Negative_Zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N =  sc.nextInt();
		if(N>0)
		{
			System.out.println(N + " is a Positive Number");
		}
		else if(N<0)
		{
			System.out.println(N + " is a Negative Number");
		}
		else
		{
			System.out.println(N + " is a zero");
		}
	}

}
