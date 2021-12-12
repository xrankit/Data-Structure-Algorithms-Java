package Loops;
import java.util.Scanner;
import java.lang.Math;
public class binarytodecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 0;
		int ans=0;
		while(n!=0)
		{
			int bit = n%10;
			if(bit ==1)
			{
				ans = ans + (int)(Math.pow(2, i));
			}
			n=n/10;
			i++;
		}
		System.out.println(ans);
	}

}
