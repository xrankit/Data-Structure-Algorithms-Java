package Loops;

import java.util.Scanner;
public class complementofbase10integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		int i =0;
		while(n!=0)
		{
			int bit = n&1;
			ans = bit * (int)(Math.pow(10, i)) + ans;
			
			n = n>>1;
			i++;
		}
		System.out.println(ans);
		
	}

}
