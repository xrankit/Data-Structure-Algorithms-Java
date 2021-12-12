package Loops;

import java.util.Scanner;
public class complementofbase10integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		int i =1;
		while(n!=0)
		{
			int bit = n&1;
			if(bit==0)
			{
			ans = ans + (1*i);
			}
			n = n>>1;
			i = i*2;
		}
		System.out.println(ans);
		
	}

}
