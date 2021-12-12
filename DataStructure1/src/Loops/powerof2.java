package Loops;
import java.util.Scanner;
import java.lang.Math;
public class powerof2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int  n = sc.nextInt();
		int ans = 0;
		for(int i =0;i<30;i++)
		{
			ans = (int)(Math.pow(2,i));
			if(ans == n)
			{
				System.out.println(true);
				break;
			}
		}
		System.out.println(false);
		
	}

}
