package Loops;

import java.util.Scanner;
public class numberof1bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		while(n!=0) 
		{
			if((n&1)==1)
			{
				count++;
			}
			n=n>>1;
		}
		System.out.println(count);
	}

}
